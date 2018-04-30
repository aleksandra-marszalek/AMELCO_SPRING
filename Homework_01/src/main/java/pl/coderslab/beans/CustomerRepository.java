package pl.coderslab.beans;

import java.util.List;

public interface CustomerRepository {

    public void addCustomer(Customer customer);
    public void removeCustomer(Customer customer);
    public List<Customer> customersList();

}
