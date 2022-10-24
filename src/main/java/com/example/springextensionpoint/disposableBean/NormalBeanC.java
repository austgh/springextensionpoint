package com.example.springextensionpoint.disposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author think
 * @date 2022年10月21日 16:46
 */
@Component
public class NormalBeanC implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean] NormalBeanC");
    }
}
