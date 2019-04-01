package ghailene.souissi.springbootapp.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages={"com.artik.springbootapp"})
@EnableJpaRepositories("com.artik.springbootapp.repositories")
@EntityScan("com.artik.springbootapp.entities")
@EnableScheduling
public class SpringbootappApplication {
	/***
	 * the main method, responsible of executing the Springboot application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}
}
