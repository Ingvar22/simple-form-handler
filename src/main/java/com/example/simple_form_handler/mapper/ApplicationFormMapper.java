package com.example.simple_form_handler.mapper;

import com.example.simple_form_handler.dto.ApplicationFormDto;
import com.example.simple_form_handler.entity.ApplicationForm;

public class ApplicationFormMapper {

    public static ApplicationFormDto toDto(ApplicationForm applicationForm) {
        ApplicationFormDto applicationFormDto =
                new ApplicationFormDto(applicationForm.getId(),
                        applicationForm.getFirstName(),
                        applicationForm.getLastName(),
                        applicationForm.getPhoneNumber()
                        );
        return applicationFormDto;
    }

    public static ApplicationForm toEntity(ApplicationFormDto applicationFormDto) {
        ApplicationForm applicationForm =
                new ApplicationForm(applicationFormDto.getFirstName(),
                        applicationFormDto.getLastName(),
                        applicationFormDto.getPhoneNumber(),
                        applicationFormDto.isCompleted(),
                        applicationFormDto.getSubmittedAt()
                        );
        return applicationForm;
    }

}
