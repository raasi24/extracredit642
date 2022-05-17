package com.example.student.survey.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * SurveyDetails bean used to return details to UI
 * author Raasi
 */
@Data
public class SurveyDetails {
    private Integer id;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String telephoneNumber;
    private String city;
    private String state;
    private String zip;
    private String email;
    private LocalDate dateOfSurvey;
    private String interestedIn;
    private List<String> mostLiked;
    private String recommending;
    private String additionalComments;
}
