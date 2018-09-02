package com.bestcode.springioc.bean;

/**
 * Instantiation with a static factory method
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.09.02
 */
public class ClientService {

    private String value;

    private ClientService(String value) {
        this.value = value;
    }

    public static ClientService createInstance(String type) {
        if ("A".equals(type)) {
            return new ClientService("aaaa");
        } else if ("B".equals(type)) {
            return new ClientService("bbbb");
        } else {
            throw new IllegalArgumentException("type must A or B");
        }
    }
}
