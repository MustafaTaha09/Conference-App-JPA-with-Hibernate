package com.example.conferenceusingjpa.controller;

import com.example.conferenceusingjpa.model.Registration;
import com.example.conferenceusingjpa.model.RegistrationReport;
import com.example.conferenceusingjpa.service.RegistrationService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// a restCOntroller means that it returns every body as a response body unlike a normal @Controller. a response body means that whatever i return, turn it into JSON.
@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public Registration getRegistration(@RequestParam String name){
        Registration register = new Registration();
        register.setName(name);

        return register;
    }

    @GetMapping("registrations")
    public List<Registration> getRegistrations(){
        List<Registration> registrations = registrationService.findAll();

        return registrations;


    }
    @GetMapping("registration-reports")
    public List<RegistrationReport> getRegistrationReports(){
        List<RegistrationReport> registrationReports = registrationService.findAllReports();

        return registrationReports;


    }

    @PostMapping("registration")
    public Registration addRegistration(Registration register){
        registrationService.addRegistration(register);

        System.out.println("Register's Name: " + register.getName());

        return register;
    }

}
