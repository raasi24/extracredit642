package com.example.student.survey.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.List;

@Converter
public class MostLikedConverter implements AttributeConverter<List<String>, String> {
    @Override
    public String convertToDatabaseColumn(List<String> list) {
        if(list == null){
            return null;
        }
        return String.join(",", list);
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        if(s == null)
            return null;
        else
            return Arrays.asList(s.split(","));
    }
}
