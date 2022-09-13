package com.example.oembed.service;

import com.example.oembed.BaseResponse;
import com.example.oembed.URL;
import com.example.oembed.dto.TwitterResult;
import com.example.oembed.dto.VimeoResult;
import com.example.oembed.dto.YoutubeResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
@Slf4j
public class OEmbedService {
    private final RestTemplate restTemplate;

    public ResponseEntity oEmbed(String url) throws URISyntaxException {

        BaseResponse res = new BaseResponse();
        String domain = urlCheck(url);

        log.info("도메인은 :: {}", domain);

        if (domain.equals("fail")) {
            return new ResponseEntity("잘못된 URL 입니다.", HttpStatus.BAD_REQUEST);
        } else {
            if (domain.equals("youtube")) {
            log.info("URL.TWITTER_URL.getUrl() + url ::: {}", URL.YOUTUBE_URL.getUrl() + url);
            Object forObject = restTemplate.getForObject(URL.YOUTUBE_URL.getUrl() + url, Object.class);
            log.info("forObject ::: {}", forObject);
            } else if (domain.equals("twitter")) {
                res.setBody(restTemplate.getForObject(URL.TWITTER_URL.getUrl() + url, TwitterResult.class));
            } else if (domain.equals("vimeo")) {
                res.setBody(restTemplate.getForObject(URL.VIMEO_URL.getUrl() + url, VimeoResult.class));
            }
            return new ResponseEntity(res, HttpStatus.OK);


        }

    }

    private static String urlCheck(String url) throws URISyntaxException {
        URI uri = new URI(url);
        String domain = uri.getHost();

        if (domain.startsWith("www.")) {
            domain = domain.substring(4);
        }
        if (domain.endsWith(".com")) {
            domain = domain.substring(0, domain.length() - 4);
        }

        boolean pattern;
        switch (domain) {
            case "youtube":
                pattern = Pattern.compile("(https://www.youtube.com/watch.*?)").matcher(url).find();
                break;
            case "twitter":
                pattern = Pattern.compile("(https://twitter.com/.*?)").matcher(url).find();
                break;
            case "vimeo":
                pattern = Pattern.compile("(https://vimeo.com/.*?)").matcher(url).find();
                break;
            default:
                pattern = false;
                break;
        }
        return pattern ? domain : "fail";
    }
}

