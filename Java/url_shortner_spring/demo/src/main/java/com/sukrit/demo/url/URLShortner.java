package com.sukrit.demo.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class URLShortner {

    private  final URLService urlService;

    private static final String error_string = "Error resolving url, \n <a href='http://localhost:8080/' >Go Home </a>";
    // Allows dependency injection
    @Autowired
    public URLShortner(URLService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/list")
    public List<URL> getList(){
        return urlService.getList();
    }

    @PostMapping("/v1/shorten")
    public String shorten(@RequestBody String url){
        return urlService.shortenUrl(url);
    }

    @GetMapping("/error_decoding")
    public String error(){
        return error_string;
    }

    @GetMapping("/1/{shortUrl}")
    public RedirectView resolve(@PathVariable String shortUrl){
        return urlService.redirectPage(shortUrl);
    }
}
