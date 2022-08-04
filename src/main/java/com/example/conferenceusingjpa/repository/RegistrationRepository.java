package com.example.conferenceusingjpa.repository;

import com.example.conferenceusingjpa.model.Registration;
import com.example.conferenceusingjpa.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
