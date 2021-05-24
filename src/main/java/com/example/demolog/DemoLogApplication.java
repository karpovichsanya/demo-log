package com.example.demolog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@SpringBootApplication
@EnableScheduling
@RequiredArgsConstructor
public class DemoLogApplication {
    private final TestRepository testRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoLogApplication.class, args);
    }

    @Scheduled(fixedDelay = 5_000L)
    public void scheduledTest(){
        testRepository.findAll().forEach(e -> log.info(e.toString()));
    }

}
