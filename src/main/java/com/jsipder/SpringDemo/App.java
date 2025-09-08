package com.jsipder.SpringDemo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.jsipder.SpringDemo.dto.Student;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/beans.xml");//by using this it created IOC container
        System.out.println("IOC container is created");
        context.getBean(Student.class);
        System.out.println(context.getBean(Student.class));
        //context=new FileSystemXmlApplicationContext("xml-file");
 //        context =new AnnotationConfigApplicationContext("java-file");
    }
}
