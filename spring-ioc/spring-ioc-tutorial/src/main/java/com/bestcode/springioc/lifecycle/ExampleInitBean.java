package com.bestcode.springioc.lifecycle;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class ExampleInitBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("do some initialization work");
    }
}
