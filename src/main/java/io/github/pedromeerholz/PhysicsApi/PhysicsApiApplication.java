package io.github.pedromeerholz.PhysicsApi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Physics API", version = "1.1",
		description = "API utilizada para realizar cálculos básicos de física. Não contem conexão com banco de dados, " +
				"seja para consultar ou armazenar informações."))
public class PhysicsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhysicsApiApplication.class, args);
	}

}
