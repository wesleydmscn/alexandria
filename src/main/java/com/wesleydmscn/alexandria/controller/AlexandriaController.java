package com.wesleydmscn.alexandria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AlexandriaController {

  @GetMapping
  public String HelloWorld() {
    return "Hello World!";
  }
}
