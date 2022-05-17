package com.example.student.survey.service;

import com.example.student.survey.bean.SurveyDetails;
import com.example.student.survey.dao.SurveyDetailsDAO;
import com.example.student.survey.entity.SurveyDetailsEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * SurveyDetailsServiceImpl save and retrieve survey details from dao
 * author Raasi
 */
@Service
public class SurveyDetailsServiceImpl implements SurveyDetailsService{
    @Autowired
    SurveyDetailsDAO surveyDetailsDAO;

    @Override
    public List<SurveyDetails> findAllSurveys() {
        List<SurveyDetailsEntity> surveyDetailsEntities = surveyDetailsDAO.findAll();
        List<SurveyDetails> surveyDetails=new ArrayList<SurveyDetails>();
        for (SurveyDetailsEntity surveyDetailsEntity :
                surveyDetailsEntities) {
            surveyDetails.add(convertEntityToBean(surveyDetailsEntity));
        }
        return  surveyDetails;
    }

    @Override
    public SurveyDetails saveSurvey(SurveyDetails surveyDetails) {
        SurveyDetailsEntity surveyDetailsEntity = convertBeanToEntity(surveyDetails);
        surveyDetailsEntity = surveyDetailsDAO.save(surveyDetailsEntity);
        return convertEntityToBean(surveyDetailsEntity);
    }

    @Override
    public void deleteById(Integer id){
        surveyDetailsDAO.deleteById(id);
    }

    public SurveyDetails convertEntityToBean(SurveyDetailsEntity surveyDetailsEntity){
        SurveyDetails surveyDetails = new SurveyDetails();
        BeanUtils.copyProperties(surveyDetailsEntity,surveyDetails);
        return surveyDetails;
    }

    public SurveyDetailsEntity convertBeanToEntity(SurveyDetails surveyDetails){
        SurveyDetailsEntity surveyDetailsEntity = new SurveyDetailsEntity();
        BeanUtils.copyProperties(surveyDetails,surveyDetailsEntity);
        return  surveyDetailsEntity;
    }
}
