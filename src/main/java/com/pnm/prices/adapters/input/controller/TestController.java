package com.pnm.prices.adapters.input.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/greeting")
public class TestController{

  @GetMapping("/hi")
  @ResponseBody
  @ResponseStatus(HttpStatus.ACCEPTED)
  private String hi(){
    log.info(":!@#$%^&*()L:");
    return "hi";
  }

}
