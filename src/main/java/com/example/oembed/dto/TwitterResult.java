package com.example.oembed.dto;

import lombok.Data;

@Data
public class TwitterResult {
    String type;
    String version;
    String provider_name;
    String provider_url;
    String author_name;
    String author_url;
    String html;
    String width;
    String height;
    String cache_age;
    String url;
}
