package micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import micro.model.Term;

@RestController
@RequestMapping("/")
public class HomeController {
    
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private Environment env;
	
	@GetMapping("file")
	public String getFile() {
		Term term = restTemplate.getForObject("http://dictionary/home", Term.class);
		return term.getFilePath();
	}
	
	@GetMapping("admin")
	public String homeAdmin() {
		return "Admin area";
	}
	
}
