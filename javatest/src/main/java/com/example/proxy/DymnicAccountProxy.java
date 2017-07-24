package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @name: com.example.proxy
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 15:07
 * @company: 上海若美科技有限公司
 */

public class DymnicAccountProxy implements InvocationHandler{

    private Object mTarget;

    public Object newInstance(Object target){
        this.mTarget = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("代理前");
        Object result = method.invoke(mTarget, objects);
        System.out.println("代理后");
        return result;
    }
}
