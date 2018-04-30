package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.bean.EmailService;
import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.MessageSender;
import pl.coderslab.bean.MessageService;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        HelloWorld hi = (HelloWorld) context.getBean("helloWorld");
        System.out.println(hi.getMessage());


        EmailService emailService = (EmailService) context.getBean("emailService") ;
        emailService.send();


        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();


        messageSender.sendMessageFromProperty();





        context.close();
    }
}