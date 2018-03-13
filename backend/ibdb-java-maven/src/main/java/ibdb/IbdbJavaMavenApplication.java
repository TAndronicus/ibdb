package ibdb;

import ibdb.model.repo.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class IbdbJavaMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbdbJavaMavenApplication.class, args);
	}

}
