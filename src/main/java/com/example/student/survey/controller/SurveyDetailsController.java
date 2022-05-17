package com.example.student.survey.controller;

import com.example.student.survey.bean.SurveyDetails;
import com.example.student.survey.service.SurveyDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SurveyDetailsController save and retrieve survey details
 * author Raasi
 */
@RestController
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SurveyDetailsController {

    @Autowired
    SurveyDetailsService surveyDetailsService;

    @GetMapping(value = "/surveyDetails")
    public ResponseEntity<List<SurveyDetails>> findAllSurveys() {
        List<SurveyDetails> surveyDetails=surveyDetailsService.findAllSurveys();
        log.info(" All Survey Details Retrieved");
        return new ResponseEntity<>(surveyDetails,HttpStatus.OK);
    }

    @GetMapping(value = "/deleteSurvey")
    public ResponseEntity<String> deleteSurvey(@RequestParam Integer id) {
        surveyDetailsService.deleteById(id);
        log.info("deleted Survey");
        return new ResponseEntity<>("success",HttpStatus.OK);
    }


    @PostMapping(value = "/saveSurvey")
    public ResponseEntity<SurveyDetails> saveSurvey(
            @RequestBody SurveyDetails surveyDetails) {
        SurveyDetails surveyDetail = surveyDetailsService.saveSurvey(surveyDetails);
        log.info("New Survey added with id {}",surveyDetail.getId());
        return new ResponseEntity<>(surveyDetail,HttpStatus.OK);
    }
}
