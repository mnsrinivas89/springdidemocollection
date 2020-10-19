package com.verizontraining.springdidemocollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/verizontraining/springdidemocollection/config.xml");
		
		Country country = (Country) ctx.getBean("country");
		System.out.println(country);
		
		StateLanguages stateLang =  (StateLanguages) ctx.getBean("stateLang");
		System.out.println(stateLang);
	}
}
