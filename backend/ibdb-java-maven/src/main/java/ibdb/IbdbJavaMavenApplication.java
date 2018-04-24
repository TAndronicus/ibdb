package ibdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class IbdbJavaMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbdbJavaMavenApplication.class, args);
	}

}
