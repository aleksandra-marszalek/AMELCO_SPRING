package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

import java.util.List;


public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        SimpleCustomerLogger simpleCustomerLogger = ctx.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
       // simpleCustomerLogger.log();

        MemoryCustomerRepository memoryCustomerRepository = (MemoryCustomerRepository) ctx.getBean("memoryCustomerRepository");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Jan");
        customer.setLastName("Kowalski");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Anna");
        customer2.setLastName("Nowak");


        memoryCustomerRepository.addCustomer(customer);
        memoryCustomerRepository.addCustomer(customer2);
       // System.out.println(memoryCustomerRepository.customersList().get(0).getFirstName());


        List<Customer> customerList = memoryCustomerRepository.getCustomerList();


        for (Customer c: customerList
             ) {
            System.out.println(c.getFirstName());
        }

                Customer newCustomer = memoryCustomerRepository.customersList().get(0);
                memoryCustomerRepository.removeCustomer(newCustomer);

        for (Customer c: customerList
                ) {
            System.out.println(c.getFirstName());
        }
    }

}