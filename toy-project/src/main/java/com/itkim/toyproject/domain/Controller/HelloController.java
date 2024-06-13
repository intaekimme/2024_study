package com.itkim.toyproject.domain.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        log.info("request come");
        return ResponseEntity.ok("hello this is spring");
    }
}
