package lk.ijse.dep10.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("diga-kondea")
@Primary
@Component
public class Nipuni implements GoodGirl{

    public Nipuni() {
        System.out.println("Nipuni Constructor()");
    }

    @Override
    public void kiss() {
        System.out.println("Nipuni: Ummmmmmaaa....!");
        System.out.println("Nipuni: Ummmmmmaaa....!");
    }
}
