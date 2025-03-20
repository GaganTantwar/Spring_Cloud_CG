package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
        Programmer obj1=(Programmer)factory.getBean("coder");
        System.out.println(obj1.getAge());
        obj1.code();


    }
}
