package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class SpringBean {

    @Autowired
    private Environment env;

    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("-------------------");
        System.out.println(env.getRequiredProperty("app.env1"));
        System.out.println(env.getRequiredProperty("app.env2"));
        System.out.println(env.getRequiredProperty("app.env3"));
        System.out.println(env.getProperty("app.env4"));
        System.out.println(env.getRequiredProperty("os.arch"));
        System.out.println(env.getRequiredProperty("java.io.tmpdir"));
        System.out.println(env.getRequiredProperty("USER"));
        System.out.println("-------------------");
    }

    public List<String> getNameList(){
        return List.of("Kasun", "Nuwan", "Ruwan", "Upul", "Sampath");
    }

    public List<CustomerDTO> getCustomerList(){
        return List.of(
                CustomerDTO.builder().id(1).name("Kasun").address("Galle").build(),
                CustomerDTO.builder().id(2).name("Nuwan").address("Matara").build(),
                CustomerDTO.builder().id(3).name("Ruwan").address("Galle").build(),
                CustomerDTO.builder().id(4).name("Supun").address("Panadura").build()
        );
    }
}
