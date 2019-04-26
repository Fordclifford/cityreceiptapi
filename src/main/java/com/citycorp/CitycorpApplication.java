package com.citycorp;

import java.io.PrintStream;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CitycorpApplication
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = SpringApplication.run(CitycorpApplication.class, args);
    
    System.out.println("Let's inspect the beans provided by Spring Boot:");
    
    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
  }
}

