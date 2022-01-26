package me.burninghandsapp.familyportal;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class FamilyPortalApplication {


	public static void main(String[] args) {
		SpringApplication.run(FamilyPortalApplication.class, args);

	}

}
