package com.example;

import com.example.proxy.Account;
import com.example.proxy.AccountImpl;
import com.example.proxy.DymnicAccountProxy;
import com.example.proxy.StaticAccountProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @name: com.example
 * @description:
 * @author：Administrator
 * @date: 2017-07-09 17:02
 * @company: 上海若美科技有限公司
 */

public class ProxyTest {

    public static void main(String[] arg ){
        dynamicProxyTest();
    }

    private static void dynamicProxyTest2() {

//        Boolean Byte 1 Short 2 Character 2 Long 8 Float 4 Double 8 Integer 4


        Account account = (Account) new DymnicAccountProxy().newInstance(new AccountImpl());
        account.getAcount();
        account.queryAccount();
    }

    private static void dynamicProxyTest() {
        Account acountProxy = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(), new Class[]{Account.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if (method.getName().equals("queryAccount")){
                    System.out.println("这里是代理的querrAcount");
                    return null;
                }else if (method.getName().equals("getAcount")){
                    System.out.println("这里是代理的getAcount");
                    return new AccountImpl();
                }
                return null;
            }
        });
        acountProxy.queryAccount();
        Account acount = acountProxy.getAcount();
        if (acount != null) {
            System.out.println("里面" );
            acount.queryAccount();
            acount.getAcount();
        }
    }

    private static void staticProxyTest() {
        new StaticAccountProxy(new AccountImpl()).queryAccount();
    }


}
