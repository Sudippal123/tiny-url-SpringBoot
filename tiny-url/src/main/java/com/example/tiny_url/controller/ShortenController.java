package com.example.tiny_url.controller;

import com.example.tiny_url.dto.ShortenURLRequest;
import com.example.tiny_url.dto.ShortenURLResponse;
import com.example.tiny_url.service.IShortenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ShortenController {
    private final IShortenService shortenService;

    public ShortenController(IShortenService shortenService) {
        this.shortenService = shortenService;
    }

    @PostMapping("shorten")
    public ResponseEntity<ShortenURLResponse> shortenURL(@RequestBody ShortenURLRequest request){
        ShortenURLResponse response = shortenService.generateShortenURL(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
