package com.ankiarena.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/foo")
public class Sample {
  @RequestMapping(value = "/bar", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<String> exception() {

    String response = "foo/bar";
    return new ResponseEntity<String>(response, HttpStatus.OK);
  }
}
