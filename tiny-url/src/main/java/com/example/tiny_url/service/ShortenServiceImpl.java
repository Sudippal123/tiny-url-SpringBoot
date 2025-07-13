package com.example.tiny_url.service;

import com.example.tiny_url.dto.ShortenURLRequest;
import com.example.tiny_url.dto.ShortenURLResponse;
import com.example.tiny_url.service.generator.IShortCodeGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ShortenServiceImpl implements IShortenService{

    private final IShortCodeGenerator shortCodeGenerator;

    public ShortenServiceImpl(IShortCodeGenerator shortCodeGenerator) {
        this.shortCodeGenerator = shortCodeGenerator;
    }

    @Override
    public ShortenURLResponse generateShortenURL(ShortenURLRequest request) {
        String shortenCode = shortCodeGenerator.generateCode(request.getOriginal_url());
        LocalDateTime curr_time = LocalDateTime.now();
        return ShortenURLResponse.builder()
                .original_url(request.getOriginal_url())
                .short_url(shortenCode)
                .created_on(curr_time)
                .expiry_on(curr_time.plusDays(1))
                .build();
    }
}
