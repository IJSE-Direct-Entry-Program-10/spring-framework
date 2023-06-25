package lk.ijse.dep10.springtransaction.dao.impl;

import lk.ijse.dep10.springtransaction.dao.CustomerDAO;
import lk.ijse.dep10.springtransaction.entity.Customer;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private final JdbcTemplate jdbcTemplate;

    private static final RowMapper<Customer> CUSTOMER_ROW_MAPPER = (rs, rowNum) -> Customer.builder().id(rs.getInt("id"))
            .name(rs.getString("name"))
            .address(rs.getString("address"))
            .contact(rs.getString("contact")).build();

    public CustomerDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", CUSTOMER_ROW_MAPPER);
    }

    @Override
    public Integer save(Customer customer) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement stm = con.prepareStatement
                    ("INSERT INTO customer (name, address, contact) VALUES (?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, customer.getName());
            stm.setString(2, customer.getAddress());
            stm.setString(3, customer.getContact());
            return stm;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public void doSomething() {
        jdbcTemplate.update("INSERT INTO customer (name, address, contact) VALUES (?,?,?)",
                "aaaaaaa", "Galle", "078-9999999");
        throw new RuntimeException("Failed to insert");
    }
}
