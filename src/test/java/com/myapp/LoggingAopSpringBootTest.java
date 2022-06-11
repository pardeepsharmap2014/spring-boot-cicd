package com.myapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.myapp.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingAopSpringBootTest
{
	@Autowired
	private EmployeeService employeeService;
	
	
	@Test
	public void testMethod1Exm() {
		employeeService.testMethod1();
	}
	@Test
	public void testMethod1Exm2() {
		employeeService.testMethod2();
	}
}