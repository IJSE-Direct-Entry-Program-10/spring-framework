package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring Bean()");
    }

    @Autowired(required = false)
    public SpringBean(String s) {
        System.out.println("SpringBean(String)");
    }

    @Autowired(required = false)
    public SpringBean(String s, Integer i) {
        System.out.println("SpringBean(String, Integer)");
    }

    @Autowired(required = false)
    public SpringBean(Integer s, BigDecimal i) {
        System.out.println("SpringBean(Integer, BigDecimal)");
    }

    @Autowired(required = false)
    public SpringBean(BigDecimal s, Integer i) {
        System.out.println("SpringBean(BigDecimal, Integer)");
    }
}
