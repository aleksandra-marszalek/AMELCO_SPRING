package pl.coderslab.beans;

import java.time.LocalDateTime;


public class SimpleCustomerLogger implements CustomerLogger {

    public SimpleCustomerLogger() {
    }

    @Override
    public void log() {
        System.out.println(LocalDateTime.now().toString()+ ": Customer operation");
    }
}
