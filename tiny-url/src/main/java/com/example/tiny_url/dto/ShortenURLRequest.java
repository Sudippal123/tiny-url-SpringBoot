package com.example.tiny_url.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShortenURLRequest {
    private String original_url;
}
