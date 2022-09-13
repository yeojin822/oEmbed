package com.example.oembed.dto;

import lombok.Data;

@Data
public class VimeoResult {
    String title;
    String type;
    String version;
    String provider_name;
    String provider_url;
    String author_name;
    String author_url;
    String is_plus;
    String html;
    String width;
    String height;
    String duration;
    String description;
    String thumbnail_url;
    String thumbnail_width;
    String thumbnail_height;
    String thumbnail_url_with_play_button;
    String upload_date;
    String video_id;
    String uri;
}
