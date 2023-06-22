package net.dep10.spring;

import lk.ijse.dep10.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

    public MyBean2() {
        System.out.println("MyBean2 Constructor");
    }

}
