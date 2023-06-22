package lk.ijse.dep10.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class SpringBean1 implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean1() {
        System.out.println("SpringBean1: Constructor()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean1: Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBean1: Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean1: Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean1: Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean1: ApplicationContext Aware");
    }
}
