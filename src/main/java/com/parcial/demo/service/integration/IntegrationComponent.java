package com.parcial.demo.service.integration;

import com.parcial.demo.models.ClientMoreThanThree;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class IntegrationComponent {

  private RestTemplate rest;
  private static String url = "http://localhost:8081/client/three";

  @PostConstruct
  private void init() {
    rest = new RestTemplateBuilder()
        .build();
  }

  public ResponseEntity<?> getMoreThanThreeCallsFromApi() {
    return rest.getForEntity(url, String.class);
  }

}
