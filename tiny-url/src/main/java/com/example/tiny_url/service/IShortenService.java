package com.example.tiny_url.service;

import com.example.tiny_url.dto.ShortenURLRequest;
import com.example.tiny_url.dto.ShortenURLResponse;

public interface IShortenService {
    ShortenURLResponse generateShortenURL(ShortenURLRequest request);
}
