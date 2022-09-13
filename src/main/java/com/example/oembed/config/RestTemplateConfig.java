package com.example.oembed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
       RestTemplate restTemplate = new RestTemplate();

       return restTemplate;
    }
}

//@Configuration
//public class RestTemplateConfig {
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//        return restTemplateBuilder.requestFactory(() -> new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()))
//        .setConnectTimeout(Duration.ofMillis(5000))
//        .setReadTimeout(Duration.ofMillis(5000))
//        .additionalMessageConverters(new StringHttpMessageConverter(Charset.forName("UTF-8"))).build();
//    }
//}
