package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 17:07
 * @company: 上海若美科技有限公司
 */

public class InsertSort extends BaseSort implements SortDao {

    private int count;

    @Override
    public int sort(int[] data) {
        count = 0;
        for (int i = 1; i < data.length; i++){//第一次插入的是1位置级坑的位置         每次是跟坑的位置的值进行比较
            if (data[i] < data[i - 1]){
                int temp = data[i];
                int j = i; //记录空的坑角标
                do {
                    count++;
                    data[j] = data[j-1];  //移动到空的坑
                    j--;
                }while (j >0 && data[j - 1] > temp);
                data[j] = temp;
            }
        }
        return count;
    }

}
