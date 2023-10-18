package com.example.downtimecicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("hello spring cicd");
    }
}
