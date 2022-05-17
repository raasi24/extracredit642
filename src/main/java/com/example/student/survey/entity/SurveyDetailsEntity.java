package com.example.student.survey.entity;

import com.example.student.survey.converter.MostLikedConverter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * SurveyDetailsEntity entity used to save and retrieve details from database
 * author Raasi
 */
@Entity
@Table(name = "survey_details")
@Data
public class SurveyDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Convert(converter = MostLikedConverter.class)
    private List<String> mostLiked;
    private String recommending;
    private String additionalComments;
}
