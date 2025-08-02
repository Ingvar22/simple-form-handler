package com.example.simple_form_handler.service.impl;

import com.example.simple_form_handler.dto.ApplicationFormDto;
import com.example.simple_form_handler.entity.ApplicationForm;
import com.example.simple_form_handler.mapper.ApplicationFormMapper;
import com.example.simple_form_handler.repository.ApplicationFormRepository;
import org.springframework.stereotype.Service;
import com.example.simple_form_handler.service.ApplicationFormService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ApplicationFormServiceImpl implements ApplicationFormService {

    private final ApplicationFormRepository applicationFormRepository;

    public ApplicationFormServiceImpl(ApplicationFormRepository applicationFormRepository) {
        this.applicationFormRepository = applicationFormRepository;
    }

    @Override
    public ApplicationFormDto createApplicationForm(ApplicationFormDto applicationFormDto) {
        ApplicationForm applicationForm = ApplicationFormMapper.toEntity(applicationFormDto);
        ApplicationFormDto newApplicationFormDto =
                ApplicationFormMapper.toDto(applicationFormRepository.save(applicationForm));
        return newApplicationFormDto;
    }

    @Override
    public List<ApplicationFormDto> getAllApplicationForms() {
        return applicationFormRepository.findAll().stream()
                .map(applicationForm ->  ApplicationFormMapper.toDto(applicationForm))
                .toList();
    }


}
