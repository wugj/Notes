package com.example;

import com.example.proxy.SortProxy;
import com.example.sort.BubbleSort;
import com.example.sort.InsertSort;
import com.example.sort.QuickSort;
import com.example.sort.ShellSort;

/**
 * @name: com.example
 * @description:
 * @author：Administrator
 * @date: 2017-07-09 17:02
 * @company: 上海若美科技有限公司
 */

public class SortTest {

    public static void main(String[] arg ){
        sortTest();
    }

    private static void sortTest() {
        int[] a = {10,16,7,3,1,4,16,7,8,9,8,4,6,21,14,10,11,3};
        new SortProxy().newInstance(new BubbleSort()).sort(a.clone());
        new SortProxy().newInstance(new QuickSort()).sort(a.clone());
        new SortProxy().newInstance(new InsertSort()).sort(a.clone());
        new SortProxy().newInstance(new ShellSort()).sort(a.clone());
    }


}
