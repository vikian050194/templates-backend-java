package com.example.spring;

import com.example.spring.models.Subject;
import com.example.spring.repositories.SubjectRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Spring Boot 2 API example", version = "1.0", description = "API description"))
public class App {

    @Autowired
    SubjectRepository subjectRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void seed() {
        subjectRepository.save(new Subject("foo"));
        subjectRepository.save(new Subject("bar"));
        subjectRepository.save(new Subject("baz"));
    }
}
