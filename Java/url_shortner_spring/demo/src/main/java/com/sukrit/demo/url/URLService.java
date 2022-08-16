package com.sukrit.demo.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;


// Service (Business logic goes here)
@Service
public class URLService {
    private final URLDatabase urlDatabase;

    @Autowired
    public URLService(URLDatabase urlDatabase) {
        this.urlDatabase = urlDatabase;
    }

    // return all mapped URLs;
    public List<URL> getList(){
        return urlDatabase.findAll();
    }

    public String validate_url(final String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            return "https://" + url;
        }
        return url;
    }
    
    public String shortenUrl(String longUrl) {
        String encoded = null;
        longUrl = validate_url(longUrl);

        // Check if url is already in the database
        Optional<URL> urlLong = urlDatabase.findURLbyLong(longUrl);
        if(urlLong.isPresent()){
            return urlLong.get().getShortURL();
        }

        // Otherwise encode till we get unique url
        // encode till we get unique url
        do {
            encoded = URL.encode(longUrl);
        }while(urlDatabase.findURLbyShort(encoded).isPresent());

        URL url_data = new URL(encoded,longUrl);
        urlDatabase.save(url_data);
        System.out.println("Successfully added new entry in Database");
        return encoded; 
    }

    public RedirectView redirectPage(String shortUrl){
        System.out.println("Finding actual URL for ");
        System.out.println(shortUrl);
        RedirectView redirectView = new RedirectView();
        String redirectUrl = getLongURL(shortUrl);

        System.out.println("Found reverse url as ");
        System.out.println(redirectUrl);
        if(redirectUrl.equals("")){
            redirectView.setUrl("/error_decoding");
            return redirectView;
        }
        redirectView.setUrl(redirectUrl);
        return redirectView;
    }

    public String getLongURL(String shortUrl) {
        Optional<URL> urlByShort = urlDatabase.findURLbyShort(shortUrl);
        if(urlByShort.isPresent()){
            return urlByShort.get().getLongURL();
        }else{
            return "";
        }
    }
}
