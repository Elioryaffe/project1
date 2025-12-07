package com.example.Project1.controller;

import com.example.Project1.objects.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Character.getName;


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
        Student student = new Student();
        @RequestMapping(value = "/Student/name", method = RequestMethod.GET)
        public ResponseEntity<?> name(){
            return new ResponseEntity<>("name=" + student.getName(), HttpStatus.OK);
        }

}
