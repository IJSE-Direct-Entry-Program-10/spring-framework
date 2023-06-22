package lk.ijse.dep10.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        System.out.println("---------------------------");

        Object springBean = ctx.getBean("springBean2");
        System.out.println(springBean);

        System.out.println("---------------------------");
    }
}
