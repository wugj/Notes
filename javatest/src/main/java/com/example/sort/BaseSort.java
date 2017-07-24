package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author：Administrator
 * @date: 2017-07-09 17:05
 * @company: 上海若美科技有限公司
 */

public class BaseSort {
    protected void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
