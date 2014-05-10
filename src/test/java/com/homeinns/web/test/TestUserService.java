package com.homeinns.web.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import com.homeinns.web.service.impl.UserServiceImpl;



public class TestUserService {
	@Test
	public void Testname() {
		
		ApplicationContext contextClassPath = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ApplicationContext contextFileSystem = new  FileSystemXmlApplicationContext("WebRoot/WEB-INF/applicationContext.xml");
		UserServiceImpl userImpl = (UserServiceImpl) contextClassPath.getBean(UserServiceImpl.class);
		String result = userImpl.sayName("Irving O(∩_∩)O~~");
		System.out.println(result);
	}
}
