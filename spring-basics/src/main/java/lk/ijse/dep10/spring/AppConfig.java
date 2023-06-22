package lk.ijse.dep10.spring;

import edu.com.ijse.Test;
import lk.ijse.dep10.spring.bean.SpringBean1;
import lk.ijse.dep10.spring.bean.SpringBean2;
import net.dep10.spring.MyBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = {"edu", "lk", "net.dep10"})
//@ComponentScan(basePackageClasses = {SpringBean1.class,
//                                    Test.class, MyBean3.class})
//@ComponentScans({
//        @ComponentScan(basePackageClasses = SpringBean1.class),
//        @ComponentScan(basePackages = {"edu", "net.dep10"})
//})
//@ComponentScan(basePackageClasses = SpringBean1.class)
//@ComponentScan(basePackages = {"edu", "net.dep10"})
@ComponentScan
@Configuration
public class AppConfig {

    // static, synchronized - are okay, but we rarely use them
    // private, final, void - not allowed
    @Bean
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }

}
