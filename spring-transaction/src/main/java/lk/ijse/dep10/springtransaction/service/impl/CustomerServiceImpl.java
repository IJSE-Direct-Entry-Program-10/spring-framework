package lk.ijse.dep10.springtransaction.service.impl;

import lk.ijse.dep10.springtransaction.dao.CustomerDAO;
import lk.ijse.dep10.springtransaction.entity.Customer;
import lk.ijse.dep10.springtransaction.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Transactional
    @Override
    public List<Customer> findAllCustomers() {
        return customerDAO.findAll();
    }

    @Override
    @Transactional
    public Customer saveCustomer(Customer customer) throws InterruptedException {
        /* Obtain a connection from the pool */
        /* Set the autocommit mode of the connection to false */
        /* Set the connection to the DAO (via JDBCTemplate) */
        /* try {*/
        Integer newId = customerDAO.save(customer);
        try {
            customerDAO.doSomething();
        }catch (Exception e){
            System.out.println("Do nothing");
        }
        customer.setId(newId);
        return customer;
        /* Commit
         * } catch(Throwable t){
         * Rollback
         * } finally{
         *   Reset the autocommit mode
         *   Release the connection
         * }*/
    }
}
