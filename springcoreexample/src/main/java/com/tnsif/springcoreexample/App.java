package com.tnsif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  //it is the IOC container
	  //It reads  and manages the beans
	  
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
	
	college College= (college)context.getBean("collegeBean");
	College.show();
  }
}
