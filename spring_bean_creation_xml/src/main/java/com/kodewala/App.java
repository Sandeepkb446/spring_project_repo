package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Account;

public class App 
{
    public static void main( String[] args )
    {
    	
        String xmlPath ="\\resources\\applicationContext.xml" ;
       ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
      Account account =  (Account) ctx.getBean("acc");
     System.out.println("Name : "+ account.getName()+ "  ,  Branch : " + account.getBranch() ); 
       
    }
}
