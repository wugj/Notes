package com.example.proxy;

import com.example.sort.SortDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @name: com.example.proxy
 * @description:
 * @author��Administrator
 * @date: 2017-07-20 17:14
 * @company: �Ϻ������Ƽ����޹�˾
 */

public class SortProxy implements InvocationHandler {

    private Object mTarget;

    public SortDao newInstance(Object object) {
        this.mTarget = object;
        return (SortDao) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("---------------------------------------------------");
        System.out.println("排序方法:   " + mTarget.getClass().getSimpleName());
        constructArrayStr((int[]) objects[0], "排序前");
        Object retsult = method.invoke(mTarget, objects);
        constructArrayStr((int[]) objects[0], "排序后");
        System.out.println("比较次数: " + retsult);
//        System.out.println("---------------------------------------------------");
        return retsult;
    }

    protected void constructArrayStr(int[] data, String stuff) {
        StringBuffer sb = new StringBuffer();
        sb.append(stuff + ":  [");
        for (int i = 0; i < data.length; i++) {
            sb.append(" " + data[i] + ", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
