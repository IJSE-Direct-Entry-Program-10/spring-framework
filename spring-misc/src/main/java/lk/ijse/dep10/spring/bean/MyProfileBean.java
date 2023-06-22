package lk.ijse.dep10.spring.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"production", "test"})
@Component
public class MyProfileBean {

    public MyProfileBean() {
        System.out.println("MyProfileBean()");
    }
}
