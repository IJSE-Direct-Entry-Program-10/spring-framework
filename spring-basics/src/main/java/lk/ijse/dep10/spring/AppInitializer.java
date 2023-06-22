package lk.ijse.dep10.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        // What is the difference between the bean definition and bean?
        System.out.println(ctx.containsBeanDefinition("springBean1"));
        System.out.println(ctx.containsBeanDefinition("springBean2"));
        System.out.println(ctx.containsBeanDefinition("springBean3"));

        Object springBean1 = ctx.getBean("springBean1");
//        Object springBean1Clone = ctx.getBean("springBean1");
//        Object springBean1CloneClone = ctx.getBean("springBean1");
        System.out.println(springBean1);
//        System.out.println(springBean1Clone);
//        System.out.println(springBean1CloneClone);
    }
}
