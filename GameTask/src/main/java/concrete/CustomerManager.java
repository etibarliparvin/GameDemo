package concrete;

import abstracts.CustomerService;
import entity.Customer;

public class CustomerManager implements CustomerService {
    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("Customer has been added : " + customer.getName());
        return true;
    }

    @Override
    public boolean removeCustomer(Integer id) {
        if(id != null){
            System.out.println("Customer has been removed.");
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        System.out.println("Customer has been updated : " + customer.getName());
        return true;
    }
}
