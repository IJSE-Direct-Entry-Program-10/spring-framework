package lk.ijse.dep10.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("SpringBean(): Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware: " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware: " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Initializing Bean with PostConstruct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean");
    }

    @PreDestroy
    public void dispose(){
        System.out.println("Disposable Bean with PreDestroy");
    }
}
