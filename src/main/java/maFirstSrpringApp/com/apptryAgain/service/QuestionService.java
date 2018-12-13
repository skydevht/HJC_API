package maFirstSrpringApp.com.apptryAgain.service;

import java.util.List;

import maFirstSrpringApp.com.apptryAgain.entity.QuestionEntity;
import maFirstSrpringApp.com.apptryAgain.model.Question;

public interface QuestionService {
	QuestionEntity create(QuestionEntity  questionEntity);

    List<QuestionEntity > getAll();


    public void delete(Integer id);

}
