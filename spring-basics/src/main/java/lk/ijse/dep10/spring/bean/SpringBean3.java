package lk.ijse.dep10.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean3 {

    public SpringBean3() {
        System.out.println("SpringBean3 Constructor()");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("SpringBean3: Inititalizing Bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SpringBean3: Disposable Bean");
    }
}
