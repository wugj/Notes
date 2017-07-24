package com.example.proxy;

/**
 * @name: com.example.proxy
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 15:07
 * @company: 上海若美科技有限公司
 */

public class StaticAccountProxy implements Account{

    private Account mAccountImpl;

    public StaticAccountProxy(Account account){
        this.mAccountImpl = account;
    }

    @Override
    public void queryAccount() {
        System.out.println("代理前");
        mAccountImpl.queryAccount();
        System.out.println("代理后");
    }

    @Override
    public Account getAcount() {
        return null;
    }
}
