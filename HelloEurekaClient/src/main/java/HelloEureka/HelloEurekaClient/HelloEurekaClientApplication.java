package HelloEureka.HelloEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaClientApplication.class, args);
	}

}
