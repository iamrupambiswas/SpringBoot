package org.biswas;
import org.biswas.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();

        Desktop desktop1 = context.getBean(Desktop.class);
        desktop1.compile();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//        System.out.println(obj.age);

    }
}
