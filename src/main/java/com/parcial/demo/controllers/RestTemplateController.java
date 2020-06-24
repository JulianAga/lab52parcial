package com.parcial.demo.controllers;

import com.parcial.demo.models.ClientMoreThanThree;
import com.parcial.demo.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestTemplateController {

  @Autowired
  IntegrationService integrationService;

  @GetMapping("/three")
  public ResponseEntity<?> getMoreThanThree() {
    return integrationService.getMoreThanThreeCalls();
  }

}
