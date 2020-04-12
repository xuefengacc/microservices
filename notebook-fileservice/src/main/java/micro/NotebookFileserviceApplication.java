package micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class NotebookFileserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotebookFileserviceApplication.class, args);
	}

}

@Configuration
class RestTemplateConfig {
	// create a bean for restTemplate to call services
	@Bean
	@LoadBalanced //load balancing between instances running at different ports
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}