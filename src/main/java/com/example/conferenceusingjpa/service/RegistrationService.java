package com.example.conferenceusingjpa.service;

import com.example.conferenceusingjpa.model.Registration;
import com.example.conferenceusingjpa.model.RegistrationReport;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
