package com.example.conferenceusingjpa.model;



public class RegistrationReport {

    private String name;
    private String courseDescription;
    private String courseName;


    public RegistrationReport(String name, String courseDescription, String courseName) {
        this.name = name;
        this.courseDescription = courseDescription;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
