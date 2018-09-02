package com.bestcode.springioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * factory bean instance
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class BookFactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return new Book("深入浅出Spring","无名");
    }

    public Class<?> getObjectType() {
        return Book.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
