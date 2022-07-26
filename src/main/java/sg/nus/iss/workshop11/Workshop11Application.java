package sg.nus.iss.workshop11;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Workshop11Application {

	public static void main(String[] args) {
		//SpringApplication.run(Workshop11Application.class, args);
		SpringApplication app = new SpringApplication(Workshop11Application.class);
		String port = "8085";
		ApplicationArguments cliOpts= new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")){
			port = cliOpts.getOptionValues("port").get(0);
		}
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

		// @Bean 
		// 	CommonsRequestLoggingFilter log(){
		// 	CommonsRequestLoggingFilter logger = 
		// 	new CommonsRequestLoggingFilter();
		// 	logger.setIncludeClientInfo(true);
		// 	logger.setIncludeQueryString(true);
		// 	return logger;
		// }

	}

	

}
