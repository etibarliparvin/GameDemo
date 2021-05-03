package abstracts;

import entity.Customer;

public interface CustomerService {
    boolean addCustomer(Customer customer);

    boolean removeCustomer(Integer id);

    boolean updateCustomer(Customer customer);
}
