package HelloEureka.HelloEurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaServiceApplication.class, args);
	}

}
