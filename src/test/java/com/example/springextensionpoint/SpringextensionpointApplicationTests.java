package com.example.springextensionpoint;

import com.example.springextensionpoint.config.AppConfig;
import com.example.springextensionpoint.factoryBean.TestFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringextensionpointApplication.class)
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class SpringextensionpointApplicationTests {
//    @Autowired
//    TestFactoryBean testFactoryBean;

    @Test
   public  void test() throws Exception {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        GhDemo gh=(GhDemo) context.getBean("hello");
//        gh.say();
        System.out.println(context.getBean("testFactoryBean"));
//        testFactoryBean.getObject();
    }

}
