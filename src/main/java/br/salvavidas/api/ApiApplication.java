package br.salvavidas.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer  {

	private static final Logger log = LoggerFactory.getLogger(ApiApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ApiApplication.class);
        log.info("Contexto: {}", ctx.getApplicationName());
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}
	
}
