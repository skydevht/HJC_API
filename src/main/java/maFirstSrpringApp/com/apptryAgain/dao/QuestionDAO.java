package maFirstSrpringApp.com.apptryAgain.dao;

import java.util.List;

import maFirstSrpringApp.com.apptryAgain.entity.QuestionEntity;

public interface QuestionDAO {

	QuestionEntity create(QuestionEntity questionEntity);

    List<QuestionEntity> getAll();


}
