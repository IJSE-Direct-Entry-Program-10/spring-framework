package lk.ijse.dep10.springtransaction.dao;

import lk.ijse.dep10.springtransaction.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();

    Integer save(Customer customer);

    void doSomething();
}
