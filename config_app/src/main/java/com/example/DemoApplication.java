package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.example", "controllers", "services", "models"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

		for (String beanName: beanNames) {
			System.out.println(beanName);
		}
	}
}
