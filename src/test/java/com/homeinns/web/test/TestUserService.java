package com.homeinns.web.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.homeinns.web.service.impl.UserServiceImpl;



public class TestUserService {
	@Test
	public void Testname() {
		
		ApplicationContext contextClassPath = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ApplicationContext contextFileSystem = new  FileSystemXmlApplicationContext("WebRoot/WEB-INF/applicationContext.xml");
		UserServiceImpl userImpl = (UserServiceImpl) contextClassPath.getBean(UserServiceImpl.class);
		String result = userImpl.sayName("Irving");
		System.out.println(result);
	}
}
