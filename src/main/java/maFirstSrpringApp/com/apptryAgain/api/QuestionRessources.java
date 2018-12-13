package maFirstSrpringApp.com.apptryAgain.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import maFirstSrpringApp.com.apptryAgain.facade.QuestionFacade;
import maFirstSrpringApp.com.apptryAgain.model.Question;

import javax.validation.Valid;

@RestController

public class QuestionRessources {
	
	@Autowired 
	private QuestionFacade questionFacade;
	
	
	@GetMapping("hjc/questions")
	public List<Question> retrieveAllQuestion()
	{
		return questionFacade.getAll();
	}

    @PostMapping(value = "/hjc/questions", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<Question> createProduct(@Valid @RequestBody Question question) {
        Question savedQuestion = questionFacade.create(question);

        return new ResponseEntity<>(savedQuestion, HttpStatus.OK);
    }

    @DeleteMapping(value = "/hjc/questions/{id}", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<Question> delete(@PathVariable(name = "id", value = "id") Integer id) {

        questionFacade.delete(id);
        return new ResponseEntity("success", HttpStatus.OK);
    }
	/*@GetMapping("hjc/questions/{id}")
	public Question retrieveQuestion(@PathVariable int id){
		Question question = questionFacade.findOne(id);

		if(question == null)
			throw new QuestionNotFoundException ("id-" +id);

		return question;
	}
	@DeleteMapping("/questions/{id}")
	public void deleteQuestion(@PathVariable int id){
		Question question = service.deleteById(id);
		
		if(question == null)
			throw new QuestionNotFoundException ("id-" +id);
	
	}
	
	
	@PostMapping("hjc/questions")
	public ResponseEntity<Object> createQuestion(@RequestBody Question question) {
		Question savedQuestion = service.save(question);
		
		 URI location = ServletUriComponentsBuilder
		.fromCurrentRequest().path("/{id}")
		.buildAndExpand(savedQuestion.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	@PutMapping("hjc/questions/{id}")
	  public Question updateQuestion(@PathVariable Integer id, @RequestBody Question question) {
	    Question update = service.findOne(id);
	    update.setReponse(question.getReponse());
	    update.setName(question.getName());
	    
	    return service.save(update);
	  }*/
	 
}
