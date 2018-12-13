package com.hjc.api.service;

import java.util.List;

import com.hjc.api.entity.QuestionEntity;

public interface QuestionService {
	QuestionEntity create(QuestionEntity  questionEntity);

    List<QuestionEntity > getAll();


    public void delete(Integer id);

}
