package com.example.oembed;

public enum URL {
    YOUTUBE_URL("https://www.youtube.com/oembed?url="),
    TWITTER_URL ("https://publish.twitter.com/oembed?url="),
    VIMEO_URL("https://vimeo.com/api/oembed.json?url=");

    String url;

    URL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
