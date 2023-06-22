package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.util.Injector;
import lk.ijse.dep10.spring.util.SuduMoona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("paniya")
public class Boy implements Injector {

    /* Property/Filed injection */
//    @Autowired
    private GoodGirl gf;

    /* Constructor injection */
//    @Autowired
    /* It is not mandatory to put @Autowired annotation if there is only one constructor */
    public Boy(@Qualifier("diga-kondea") @SuduMoona GoodGirl gf) {
        this.gf = gf;
        System.out.println("Paniya: Constructor()");
        System.out.println("Paniya:constructor: Have I got a girl friend? " + gf);
    }

    /* Setter method injection */
//    @Autowired
    public void setGf(GoodGirl gf) {
        this.gf = gf;
    }

    /* Interface through injection */
//    @Autowired
    @Override
    public void inject(GoodGirl goodGirl) {
        this.gf = goodGirl;
    }

//    public Boy() {
//        System.out.println("Paniya: Constructor()");
//        System.out.println("Paniya:constructor: Have I got a girl friend? " + gf);
//    }

    @PostConstruct
    public void initialize() {
        System.out.println("Paniya:initialize: Have I got a girl friend? " + gf);
        if (gf != null) gf.kiss();
    }

}
