package com.example.student.survey.dao;

import com.example.student.survey.entity.SurveyDetailsEntity;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * SurveyDetailsDAO save retrieve details from database
 * author Raasi
 */
@RepositoryDefinition(domainClass = SurveyDetailsEntity.class,idClass = Integer.class)
public interface SurveyDetailsDAO {
    List<SurveyDetailsEntity> findAll();
    SurveyDetailsEntity save(SurveyDetailsEntity employeeEntity);
    void deleteById(Integer id);
}
