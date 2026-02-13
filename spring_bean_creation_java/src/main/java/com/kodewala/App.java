package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.SpringConfig;
import com.kodewala.person.Person;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
       
       Person person = (Person)ctx.getBean("p1");
       
       System.out.println(person.getUserName() + "    "  +   person.getPassword());
       
    }
}
