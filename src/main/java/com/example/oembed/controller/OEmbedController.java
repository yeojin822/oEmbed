package com.example.oembed.controller;

import com.example.oembed.service.OEmbedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
public class OEmbedController {

        private final OEmbedService oEmbedService;

        @GetMapping("/api/oembed")
        public ResponseEntity<?> oEmbed(@RequestParam(value = "url") String url) throws URISyntaxException {
            return oEmbedService.oEmbed(url);
        }
}
