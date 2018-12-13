package maFirstSrpringApp.com.apptryAgain.facade;

import java.util.List;
import java.util.Optional;

import maFirstSrpringApp.com.apptryAgain.entity.QuestionEntity;
import maFirstSrpringApp.com.apptryAgain.model.Question;

public interface QuestionFacade {

	public List<Question> getAll();


    public Question create(Question questionDTO);

   public void delete(Integer id);

}
