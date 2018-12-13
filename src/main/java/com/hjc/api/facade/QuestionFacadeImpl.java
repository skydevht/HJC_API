package com.hjc.api.facade;

import java.util.List;

import com.hjc.api.entity.QuestionEntity;
import com.hjc.api.model.Question;
import com.hjc.api.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjc.api.mapper.QuestionMapper;

@Service
public class QuestionFacadeImpl implements QuestionFacade{

	@Autowired
	private QuestionService questionService;
	@Autowired
	private QuestionMapper questionMapper;


	@Override
	public List<Question> getAll() {
		List<QuestionEntity> questionEntities = questionService.getAll();

		return questionMapper.map(questionEntities);
	}
    @Override
    public Question create(Question questionDTO) {
        QuestionEntity questionEntity = questionMapper.map(questionDTO);
        QuestionEntity returnedQuestionEntity = questionService.create(questionEntity);
        return questionMapper.map(returnedQuestionEntity);
    }
	@Override
	public void delete(Integer id) {
		questionService.delete(id);
	}


    /*

	@Override
	public Question findOne (int id ) {
		for (Question question : questions) {
			if(question.getId()==id) {
				return question;
			}
		}
		return null;
	}*/
}
