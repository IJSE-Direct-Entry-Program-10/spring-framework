package lk.ijse.dep10.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    public SpringBean1() {
        System.out.println("SpringBean1()");
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

    @Bean
    public SpringBean2 springBean2(){
        springBean4();
        springBean4();
        springBean4();
        springBean4();
        return new SpringBean2(springBean4());
    }

    @Scope("prototype")
    @Bean
    public SpringBean4 springBean4(){
        System.out.println("Creating a new springBean4");
        return new SpringBean4();
    }
}
