package org.apache.dubbo;

import org.apache.dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceConsumer {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:demo-consumer.xml");

		DemoService bean = (DemoService) context.getBean("demoService");

		String sayHello = bean.sayHello("apache");

		System.out.println(sayHello);

		System.out.println("The remote call is over!");
	}
}
