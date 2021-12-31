package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
@SpringBootApplication
public class AmsApiApplication {
	public static String uploadDirectory =
			System.getProperty("user.dir")+"/src/main/resources/static/uploads";

	public static void main(String[] args) {
		new File(uploadDirectory).mkdir();
		SpringApplication.run(AmsApiApplication.class, args);
	}

}
