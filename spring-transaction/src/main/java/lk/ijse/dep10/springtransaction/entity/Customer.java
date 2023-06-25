package lk.ijse.dep10.springtransaction.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private int id;
    private String name;
    private String address;
    private String contact;

    public Customer(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
}
