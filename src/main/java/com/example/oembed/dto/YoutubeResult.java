package com.example.oembed.dto;

import lombok.Data;

@Data
public class YoutubeResult {
    String title;
    String type;
    String version;
    String provider_name;
    String provider_url;
    String author_name;
    String author_url;
    String html;
    String width;
    String height;
    String thumbnail_url;
    String thumbnail_width;
    String thumbnail_height;
}
