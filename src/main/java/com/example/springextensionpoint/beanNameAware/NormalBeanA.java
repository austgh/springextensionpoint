package com.example.springextensionpoint.beanNameAware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author think
 * @date 2022年10月21日 16:06
 */
@Component
public class NormalBeanA implements BeanNameAware {
    public NormalBeanA() {
        System.out.println("NormalBean constructor");
    }

    @Override
    public void setBeanName(String name) {
        name = "helloWord";
        System.out.println("[BeanNameAware] " + name);
    }
    /*
     * 这个并不算一个扩展点，其实就是一个标注。其作用是在bean的初始化阶段，如果对一个方法标注了@PostConstruct，会先调用这个方法。
     * 这里重点是要关注下这个标准的触发点，这个触发点是在postProcessBeforeInitialization之后，InitializingBean.afterPropertiesSet之前。
     * @date 2022/10/21 16:08
     */
    @PostConstruct
    public void init(){
        System.out.println("[PostConstruct] NormalBeanA");
    }
}