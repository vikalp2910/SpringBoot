package edu.vikalp.secondapp;

import edu.vikalp.secondapp.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApp2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringbootApp2Application.class, args);
		//MyService service=context.getBean(MyService.class);
		MyService service=context.getBean("my-service",MyService.class);
		String result=service.m1("vikalp");
		System.out.println(result);

		System.out.println("===================");
		int count =context.getBeanDefinitionCount();
		System.out.println(count);

		System.out.println("===================");
		String[] names=context.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}

		System.out.println("===================");

	}

}
