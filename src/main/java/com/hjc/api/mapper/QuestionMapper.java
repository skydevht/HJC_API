package com.hjc.api.mapper;


import com.hjc.api.entity.QuestionEntity;
import com.hjc.api.model.Question;
import org.mapstruct.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

	  QuestionEntity map(Question question);

	  Question map(QuestionEntity questionEntity);

	    List<QuestionEntity> map(List<Question> questionList);

	    List<Question> map(Collection<QuestionEntity> questionEntityList);
}
