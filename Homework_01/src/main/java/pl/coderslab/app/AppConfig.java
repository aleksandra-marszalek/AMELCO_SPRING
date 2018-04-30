package pl.coderslab.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import pl.coderslab.beans.*;

import java.io.FileWriter;
import java.io.IOException;


@ComponentScan(basePackages = {"pl.coderslab.beans"})
public class AppConfig {

    final String LOGFILE = "system.log";


    @Bean
    @Primary
    public DBConn dbConn(){
        //get data from config file / container
        return new DBConn("127.0.0.1","JEE_SPRING", "root","pass");
    }

    @Bean
    public DBConn dbLogConn(){
        //get data from config file / container
        return new DBConn("127.0.0.1","JEE_SPRING_LOG", "root","pass");
    }


    @Bean
    @Primary
    public CustomerLogger fileCustomerLogger(){
        return new FileCustomerLogger("system.log");
    }

    @Bean
    public CustomerLogger simpleCustomerLogger() {
        return new SimpleCustomerLogger();
    }

    @Bean
    public FileWriter fileWriter() throws IOException {
        return new FileWriter(LOGFILE);
    }




}