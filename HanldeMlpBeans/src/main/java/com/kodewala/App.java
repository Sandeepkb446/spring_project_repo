package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.kodewala.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
       AccountMng accmgm = ctx.getBean(AccountMng.class);
       accmgm.doAccounts();
    }
}
