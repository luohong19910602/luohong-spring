package com.skg.luohong.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skg.luohong.user.controller.UserController;

public class TestIoc {
	
	@Test
    public void testDependenyInjection(){
		//实例化spring container
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"classpath:conf/bean-ioc.xml"});
		
		//拿到bean
		UserController userController= context.getBean(UserController.class);

		//调用bean
		userController.add();
		userController.delete();
    }
}
