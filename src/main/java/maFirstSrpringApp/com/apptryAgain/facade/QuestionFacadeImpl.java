package maFirstSrpringApp.com.apptryAgain.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maFirstSrpringApp.com.apptryAgain.entity.QuestionEntity;
import maFirstSrpringApp.com.apptryAgain.mapper.QuestionMapper;
import maFirstSrpringApp.com.apptryAgain.model.Question;
import maFirstSrpringApp.com.apptryAgain.service.QuestionService;

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
