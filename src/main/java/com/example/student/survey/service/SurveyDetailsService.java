package com.example.student.survey.service;

import com.example.student.survey.bean.SurveyDetails;

import java.util.List;

public interface SurveyDetailsService {
    List<SurveyDetails> findAllSurveys();
    SurveyDetails saveSurvey(SurveyDetails employeeBean);
    void deleteById(Integer id);
}
