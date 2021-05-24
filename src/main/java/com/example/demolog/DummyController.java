package com.example.demolog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DummyController {

    @GetMapping
    public String test() {
        log.error("controller call");
        return "rest controller call";
    }
}
