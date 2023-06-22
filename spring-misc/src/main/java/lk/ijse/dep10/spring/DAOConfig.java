package lk.ijse.dep10.spring;

import lk.ijse.dep10.spring.bean.DAOBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {

    @Bean
    public DAOBean daoBean(){
        return new DAOBean();
    }
}
