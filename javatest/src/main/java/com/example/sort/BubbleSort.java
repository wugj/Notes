package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author：Administrator
 * @date: 2017-07-09 17:06
 * @company: 上海若美科技有限公司
 */

public class BubbleSort extends BaseSort implements SortDao {
    @Override
    public int sort(int[] data) {
        int count = 0;
        boolean flag = true;
        for (int i= 0; i < (data.length - 1) && flag; i++) {
            flag = false;
            for (int j = 1; j < data.length - i; j++){
                count++;
                if (data[j] < data[j-1]){
                    swap(data, j, j-1);
                    flag = true;
                }

            }
        }
        return count;
    }
}
