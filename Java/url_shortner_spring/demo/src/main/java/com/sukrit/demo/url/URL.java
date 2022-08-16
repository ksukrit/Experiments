package com.sukrit.demo.url;

import javax.persistence.*;

@Entity
@Table
public class URL {
    @Id
    @SequenceGenerator(
            name = "url_sequence",
            sequenceName = "url_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "url_sequence")
    private long Id;
    private String ShortURL;
    private String LongURL;

    public URL() {

    }

    public URL(String shortURL, String longURL) {
        ShortURL = shortURL;
        LongURL = longURL;
    }

    public URL(String longURL) {
        LongURL = longURL;
    }

    public void setLongURL(String longURL) {
        LongURL = longURL;
    }

    public void setShortURL(String shortURL) {
        ShortURL = shortURL;
    }

    public String getLongURL() {
        return LongURL;
    }

    public String getShortURL() {
        return ShortURL;
    }

    public static String encode(String longUrl) {
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String key = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int r = (int) (Math.random() * charSet.length());
            sb.append(charSet.charAt(r));
        }
        key = sb.toString();
        return key;
    }
}
