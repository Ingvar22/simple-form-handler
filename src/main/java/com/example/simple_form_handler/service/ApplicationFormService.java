package com.example.simple_form_handler.service;

import com.example.simple_form_handler.dto.ApplicationFormDto;

import java.util.List;

public interface ApplicationFormService {

    public ApplicationFormDto createApplicationForm(ApplicationFormDto applicationFormDto);
    public List<ApplicationFormDto> getAllApplicationForms();

}
