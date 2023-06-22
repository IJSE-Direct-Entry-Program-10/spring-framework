package lk.ijse.dep10.spring.bean;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

    public SpringBean2(@Nullable Integer i) {
        System.out.println("SpringBean2 Constructor " + i);
    }
}
