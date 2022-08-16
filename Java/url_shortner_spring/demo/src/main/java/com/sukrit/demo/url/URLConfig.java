package com.sukrit.demo.url;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Add some data to the server
@Configuration
public class URLConfig {
    @Bean
    public CommandLineRunner commandLineRunner(URLDatabase urlDatabase) {
        return args -> {
            URL url1 = new URL("goo","https://www.google.com");
            URL url2 = new URL("fb","https://www.facebook.com");
            urlDatabase.saveAll(
                    List.of(url1,url2)
            );
        };
    }
}
