package lk.ijse.dep10.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");

    }
}
