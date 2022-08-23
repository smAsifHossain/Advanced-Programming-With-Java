package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        //Instantiating a container

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
        Student student1 = (Student) context.getBean("student1");
        //Student student1 = context.getBean("student1",Student.class);
        System.out.println(student1);


    }
}
