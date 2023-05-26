package by.itacademy;

import by.itacademy.spring.Driver;
import by.itacademy.spring.Task6;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contex = new ClassPathXmlApplicationContext("application.xml");
        var driver = contex.getBean("driver", Driver.class);
        var math = contex.getBean("task6", Task6.class);
        System.out.println(math);
        /*System.out.println(driver.getAge());
        System.out.println(driver.getCar());
        System.out.println(driver);*/
        contex.close();

    }
}