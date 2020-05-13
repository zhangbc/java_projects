package com.patterns;

/**
 *  空对象模式-实现抽象类的RealCustomer实体类(2)
 *
 * @author zhangbocheng
 * @version v1.0
 * @date 2020/5/13 13:16
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
