package com.namee.nonos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.namee.nonos")
@EnableAutoConfiguration
@SpringBootApplication
public class NonosRun {
	public static void main(String[] args) {
		SpringApplication.run(NonosRun.class, args);
	}
}
