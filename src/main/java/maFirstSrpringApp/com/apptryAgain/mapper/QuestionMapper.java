package maFirstSrpringApp.com.apptryAgain.mapper;


import org.mapstruct.Mapper;

import maFirstSrpringApp.com.apptryAgain.entity.QuestionEntity;
import maFirstSrpringApp.com.apptryAgain.model.Question;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

	  QuestionEntity map(Question question);

	  Question map(QuestionEntity questionEntity);

	    List<QuestionEntity> map(List<Question> questionList);

	    List<Question> map(Collection<QuestionEntity> questionEntityList);
}
