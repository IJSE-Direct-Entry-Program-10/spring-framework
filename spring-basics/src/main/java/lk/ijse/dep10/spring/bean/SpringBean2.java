package lk.ijse.dep10.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean2 implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean2() {
        System.out.println("SpringBean2 Constructor()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean2: Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBean2: Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean2: Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean2: Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean2: ApplicationContext Aware");
    }
}
