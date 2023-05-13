package com.example.spring.controllers;

import com.example.spring.models.Subject;
import com.example.spring.repositories.SubjectRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    
    @Autowired
    SubjectRepository subjectRepository;
    
    @GetMapping("")
    public Iterable<Subject> getSubjects(){
        return subjectRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    
    @PostMapping("")
    @ResponseStatus(value = HttpStatus.OK)
    public Subject addSubject(@Valid @RequestBody Subject subject){
        return subjectRepository.save(subject);
    }
}
