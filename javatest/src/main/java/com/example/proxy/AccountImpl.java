package com.example.proxy;

/**
 * @name: com.example.proxy
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 15:03
 * @company: 上海若美科技有限公司
 */

public class AccountImpl implements Account {
    @Override
    public void queryAccount() {
        System.out.println("实现  acountImpl  queryCount");
    }

    @Override
    public Account getAcount() {
        System.out.println("实现  acountImpl  getAcount");
        return null;
    }
}
