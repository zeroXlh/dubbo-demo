package org.apache.dubbo.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceProvider {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		context.start();

		System.out.println("------------------demo service starting!------------------");
		try {
			// 输入任意值结束
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("------------------demo service stopped!------------------");
	}
}
