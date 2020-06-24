package com.parcial.demo.service;

import com.parcial.demo.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
public class IntegrationService {

  @Autowired
  IntegrationComponent integrationComponent;

  public ResponseEntity<?> getMoreThanThreeCalls() {
    try {
      return integrationComponent.getMoreThanThreeCallsFromApi();
    } catch (RestClientException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
