package com.bestcode.springioc.dependency;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class ServiceA {

    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public ServiceB getServiceB() {
        return serviceB;
    }
}
