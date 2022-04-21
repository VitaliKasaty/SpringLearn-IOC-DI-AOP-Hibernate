package com.udemy.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
	
	  @Before("com.udemy.spring.aop.aspect.MyPointcuts.allAddMethods()") 
	  public void beforeAddSecurityAdvice() {
		  System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала"); 
		  System.out.println("---------------");
	  }

}