package com.sukrit.demo.url;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Responsible for data access
// Use this repository in our service
@Repository
public interface URLDatabase extends JpaRepository<URL,String> {

    @Query("SELECT u FROM URL u WHERE u.ShortURL=:shortUrl")
    Optional<URL> findURLbyShort(String shortUrl);

    @Query("SELECT u FROM URL u WHERE u.LongURL=:longUrl")
    Optional<URL> findURLbyLong(String longUrl);
}
