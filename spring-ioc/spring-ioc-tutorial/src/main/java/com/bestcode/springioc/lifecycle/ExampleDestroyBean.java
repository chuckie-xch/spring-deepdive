package com.bestcode.springioc.lifecycle;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class ExampleDestroyBean implements DisposableBean {

    public void destroy() throws Exception {
        System.out.println("do some destroy work");
    }
}
