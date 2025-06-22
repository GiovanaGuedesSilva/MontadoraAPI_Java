package io.github.giovanaguedessilva.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("producao", "homologacao");

		// Inicia o contexto e retorna o ApplicationContext real (builder.context() está quase sempre null)
		ConfigurableApplicationContext applicationContext = builder.run(args);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();

		System.out.println("Nome da aplicação: " + environment.getProperty("spring.application.name"));
	}
}
