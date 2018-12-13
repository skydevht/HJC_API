package com.hjc.api.dao;

import java.util.List;

import com.hjc.api.entity.QuestionEntity;

public interface QuestionDAO {

	QuestionEntity create(QuestionEntity questionEntity);

    List<QuestionEntity> getAll();


}
