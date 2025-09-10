package Qspider.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Qspider.DependencyInjection.dto.Car;
import Qspider.DependencyInjection.dto.Hospital;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        ApplicationContext contex= new ClassPathXmlApplicationContext("META-INF/beans.xml");
//        Car car1=contex.getBean("car",Car.class);
//        System.out.println(car1);
        
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/beans.xml");
        Hospital hp=context.getBean("Hospital",Hospital.class);
        System.out.println(hp);
    }
}
