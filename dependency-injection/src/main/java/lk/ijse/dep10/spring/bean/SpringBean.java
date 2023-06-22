package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SpringBean {

    public SpringBean(@Qualifier("note") String[] something) {
        System.out.println("SpringBean: Constructor() ");
        System.out.println(Arrays.toString(something));
    }

//    public SpringBean(List<String> something) {
//        System.out.println("SpringBean: Constructor() ");
//        System.out.println(something);
//    }

//    public SpringBean(Collection<String> something) {
//        System.out.println("SpringBean: Constructor() ");
//        System.out.println(something);
//    }

//    public SpringBean(Set<String> something) {
//        System.out.println("SpringBean: Constructor() ");
//        System.out.println(something);
//    }

//    public SpringBean(Map<String, String> something) {
//        System.out.println("SpringBean: Constructor() ");
//        System.out.println(something);
//    }
}
