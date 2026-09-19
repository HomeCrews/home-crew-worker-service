package com.homecrew.workerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
public class WorkerController {

  @GetMapping("/test")
  public String test() {
    return "Worker Service is working";
  }
}
