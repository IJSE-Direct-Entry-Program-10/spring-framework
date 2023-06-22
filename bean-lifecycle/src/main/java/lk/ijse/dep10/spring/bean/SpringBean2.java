package lk.ijse.dep10.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {

    public SpringBean2() {
        System.out.println("SpringBean2() Constructor");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Place your initialization logic here");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Place your destruction logic here");
    }
}
