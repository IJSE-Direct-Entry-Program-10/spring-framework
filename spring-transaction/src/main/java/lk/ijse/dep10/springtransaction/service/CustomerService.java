package lk.ijse.dep10.springtransaction.service;

import lk.ijse.dep10.springtransaction.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer) throws InterruptedException;
}
