package lk.ijse.dep10.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean4 {

    public SpringBean4() {
        System.out.println("SpringBean4()");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("SpringBean4: Initialize(): " + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SpringBean4: destroy(): " + this);
    }
}
