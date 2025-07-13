package com.example.tiny_url.service.generator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
@Primary
public class Base64ShortCodeGenerator implements IShortCodeGenerator {
    @Override
    public String generateCode(String input) {
        return Base64.getUrlEncoder().withoutPadding().encodeToString(input.getBytes());
    }
}
