package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.util.SuduMoona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SuduMoona
@Qualifier("diga-kondea")
@Primary
@Component
public class Sadani implements GoodGirl {

    public Sadani() {
        System.out.println("Sadani: Constructor()");
    }

    @Override
    public void kiss() {
        System.out.println("Sadani: Ummmmmma.....!");
        System.out.println("Sadani: Ummmmmma.....!");
    }
}
