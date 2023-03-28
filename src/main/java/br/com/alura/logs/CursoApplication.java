package br.com.alura.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication {

	private static final Logger log = LoggerFactory.getLogger(CursoApplication.class);

	public static void main(String[] args) {
		log.info("Iniciando a API de cursos ALURA");
		SpringApplication.run(CursoApplication.class, args);
		log.info("API para cadastro de cursos");
	}
}
