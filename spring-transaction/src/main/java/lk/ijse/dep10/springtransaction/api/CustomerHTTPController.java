package lk.ijse.dep10.springtransaction.api;

import lk.ijse.dep10.springtransaction.entity.Customer;
import lk.ijse.dep10.springtransaction.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerHTTPController {

    private final CustomerService customerService;

    public CustomerHTTPController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) throws InterruptedException {
        return customerService.saveCustomer(customer);
    }
}
