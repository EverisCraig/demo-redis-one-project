package com.craig.pe.demoredisoneproject.controller;

import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/caches")
public class CacheController {

    private final CacheManager cacheManager;


    public CacheController(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @PatchMapping("/{name}")
    public void evictCache(@PathVariable String name){
        Objects.requireNonNull(this.cacheManager.getCache(name)).clear();
    }
}
