package lk.ijse.dep10.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
//        ctx.register(DAOConfig.class);
        ctx.getEnvironment().setActiveProfiles("production", "test");
        ctx.refresh();
        ctx.registerShutdownHook();
        System.out.println(ctx.containsBeanDefinition("springBean"));
        System.out.println(ctx.containsBeanDefinition("conditionalSpringBean"));
    }
}
