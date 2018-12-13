package com.hjc.api.facade;

import java.util.List;

import com.hjc.api.model.Question;

public interface QuestionFacade {

	public List<Question> getAll();


    public Question create(Question questionDTO);

   public void delete(Integer id);

}
