package com.bestcode.springioc.dependency;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * test class
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class DependencyApplication {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("ioc-dependency.xml");
    }

    @Test
    public void testConstructorDI() {
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister.getMovieFinder());
    }

    @Test
    public void testSetterDI() {
        ServiceA serviceA = context.getBean("serviceA", ServiceA.class);
        System.out.println(serviceA.getServiceB());
    }
}
