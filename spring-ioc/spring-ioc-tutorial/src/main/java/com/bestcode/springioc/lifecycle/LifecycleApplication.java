package com.bestcode.springioc.lifecycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class LifecycleApplication {


    private ConfigurableApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("ioc-lifecycle.xml");
    }

    @Test
    public void testInit() {
        ExampleInitBean exampleInitBean = context.getBean("exampleInitBean", ExampleInitBean.class);
    }

    @Test
    public void testDestroy() {
        ExampleDestroyBean exampleDestroyBean = context.getBean("exampleDestroyBean", ExampleDestroyBean.class);
        context.registerShutdownHook();
    }
}
