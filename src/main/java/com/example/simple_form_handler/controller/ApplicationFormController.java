package com.example.simple_form_handler.controller;

import com.example.simple_form_handler.dto.ApplicationFormDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.simple_form_handler.service.ApplicationFormService;

import java.util.List;

@RestController
@RequestMapping("/forms")
public class ApplicationFormController {

    private final ApplicationFormService applicationFormService;

    public ApplicationFormController(ApplicationFormService applicationFormService) {
        this.applicationFormService = applicationFormService;
    }

    @GetMapping
    public ResponseEntity<List<ApplicationFormDto>> getAllApplicationForms() {
        return new ResponseEntity<>(applicationFormService.getAllApplicationForms(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ApplicationFormDto> createApplicationForm(@RequestBody ApplicationFormDto applicationFormDto) {
        return new ResponseEntity<>(applicationFormService.createApplicationForm(applicationFormDto), HttpStatus.CREATED);
    }

}
