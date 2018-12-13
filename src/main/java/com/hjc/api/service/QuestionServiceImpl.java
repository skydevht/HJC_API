package com.hjc.api.service;

import java.util.*;

import com.hjc.api.entity.QuestionEntity;
import com.hjc.api.exception.QuestionNotFoundException;
import com.hjc.api.repository.QuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.ImmutableList;


@Service
public class QuestionServiceImpl implements QuestionService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(QuestionServiceImpl.class);

	    @Autowired
	    private QuestionRepository questionRepository;



	@Override
    public List<QuestionEntity> getAll() {
		LOGGER.info("getting all questions");
        return ImmutableList.copyOf(questionRepository.findAll());
    }
	@Override
	public QuestionEntity create(QuestionEntity questionEntity) {
		if (questionEntity == null) {
			LOGGER.warn("Product Entity cannot be null");
			throw new QuestionNotFoundException("Product Entity cannot be null");
		}
		return questionRepository.save(questionEntity);
	}
	@Override
	public void delete(Integer id) {
		questionRepository.deleteById(id);
	}

	/*public List<Question> findAll(){
		return questions;
	}

	public Question save (Question question ) {
		if (question.getId()==null) {
			question.setId(++ questionCount);
		}
		questions.add(question);
		return question;
	}

	public Question findOne (int id ) {
		for (Question question : questions) {
			if(question.getId()==id) {
				return question;
			}
		}
		return null;
	}
	public Question deleteById (int id ) {
		Iterator <Question> iterator =questions.iterator();
		while(iterator.hasNext()) {
			Question question = iterator.next();
			if(question.getId()==id) {
				iterator.remove();
				return question;
			}
		}
		return null;
	}
	  public Question updateQuestion(@PathVariable Integer id, @RequestBody Question question) {
	  return question;
	  }

	@Override
	public QuestionEntity create(QuestionEntity questionEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	  */
	
}
