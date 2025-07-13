package com.example.tiny_url.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ShortenURLResponse {
    private String short_url;
    private String original_url;
    private LocalDateTime created_on;
    private LocalDateTime expiry_on;
}
