package com.nkh1987.banking;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking application",
				description = "Spring Boot backend along with docker and swagger",
				version = "v1.0",
				contact = @Contact(
						name = "Nima Khodabande",
						email = "nima.khodabandelou@gmail.com",
						url = "https://github.com/Nima-Khodabandelou"
				),
				license = @License(
						name = "Banking app",
						url = "https://github.com/Nima-Khodabandelou/java_spring_banking_application"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot banking app",
				url = "https://github.com/Nima-Khodabandelou/java_spring_banking_application"
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
