package com.example.conferenceusingjpa.service;

import com.example.conferenceusingjpa.model.Course;
import com.example.conferenceusingjpa.model.Registration;
import com.example.conferenceusingjpa.model.RegistrationReport;
import com.example.conferenceusingjpa.repository.CourseRepository;
import com.example.conferenceusingjpa.repository.CourseRepositoryImpl;
import com.example.conferenceusingjpa.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration){

       registration = registrationRepository.save(registration); //8ayrna hna brdo eno yrg3 registration 34an 3ayzen nmskoh w npasseh fe object elcourse ely ta7t.
                                                                // leh? 34an 3ayzen nafs elID da m4 ID gded.
            Course course = new Course();
            course.setName("Cs");
            course.setDescription("Intro to Computer Science");
            course.setRegistration(registration); //34an n7ot elregistration hna aho.

            courseRepository.save(course);




       return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {

            return registrationRepository.findAllReports();
    }

}
