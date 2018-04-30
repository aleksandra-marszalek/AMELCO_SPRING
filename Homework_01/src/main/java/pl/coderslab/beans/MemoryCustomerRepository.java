package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    @Autowired
    private CustomerLogger customerLogger;


    public MemoryCustomerRepository() {

    }

    public CustomerLogger getCustomerLogger() {
        return customerLogger;
    }

    public void setCustomerLogger(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerLogger.log();
        customerList.add(customer);

    }

    @Override
    public void removeCustomer(Customer customer) {
        customerLogger.log();
        customerList.remove(customer);

    }

    @Override
    public List<Customer> customersList() {
        customerLogger.log();
        return getCustomerList();

    }



}
