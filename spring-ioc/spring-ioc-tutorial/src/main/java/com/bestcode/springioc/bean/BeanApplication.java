package com.bestcode.springioc.bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class BeanApplication {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("ioc-bean.xml");
    }

    @Test
    public void testBean() {
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testFactoryBean () {
        Book book = context.getBean("bookFactoryBean", Book.class);
        System.out.println(book);
    }

    @Test
    public void testPrototypeBean() {
        PrototypeBean beanOne = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean beanTwo = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(beanOne != beanTwo);
    }
}
