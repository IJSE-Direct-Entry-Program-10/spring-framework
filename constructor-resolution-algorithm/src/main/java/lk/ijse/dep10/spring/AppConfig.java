package lk.ijse.dep10.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String myString(){
        return "IJSE";
    }

    @Bean
    public Integer myInt(){
        return 10;
    }

    @Bean
    public BigDecimal myBigDecimal(){
        return new BigDecimal("100.25");
    }
}
