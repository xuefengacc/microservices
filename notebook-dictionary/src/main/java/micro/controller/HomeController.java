package micro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import micro.model.Term;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("home")
	public ResponseEntity<Term> homePoint(){
		Term sample = new Term();
		sample.setTermId(1000);
		sample.setTermName("Sample");
		sample.setFilePath("PATH");
		
		return new ResponseEntity<Term>(sample,HttpStatus.OK);
	}
	
}
