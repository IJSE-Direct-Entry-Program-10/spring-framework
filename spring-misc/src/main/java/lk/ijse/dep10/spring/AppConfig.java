package lk.ijse.dep10.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@ImportResource({"classpath:context.xml"})
@Import({DAOConfig.class})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        System.out.println("Created before all beans");
        return new PropertySourcesPlaceholderConfigurer();
    }
}
