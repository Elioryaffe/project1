package com.example.Project1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api")
    public class HelloController {

        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public ResponseEntity<?> hello(){
            return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

        @RequestMapping(value = "/bye", method = RequestMethod.GET)
        public ResponseEntity<?> bye(){
            return new ResponseEntity<>("bye World!", HttpStatus.OK);
        }

        @RequestMapping(value = "/sex", method = RequestMethod.GET)
        public ResponseEntity<?> sex(){
            return new ResponseEntity<>("אתה רוצה זין", HttpStatus.OK);
        }
}
