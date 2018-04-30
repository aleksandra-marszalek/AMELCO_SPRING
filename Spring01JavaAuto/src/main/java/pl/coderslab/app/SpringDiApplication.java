package pl.coderslab.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.coderslab.beans.Auto1;
import pl.coderslab.beans.Auto2;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Auto1 auto1 = ctx.getBean(Auto1.class);
        System.out.println(auto1.getAuto2().getClass().getName());

        System.out.println(auto1.getAuto2().getName());


    }
}
