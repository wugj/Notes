package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 17:07
 * @company: 上海若美科技有限公司
 */

public class ShellSort extends BaseSort implements SortDao {

    private int count;

    @Override
    public int sort(int[] array) {
        count = 0;
        int x;
        for (int group = (int) Math.ceil(array.length / 2); group > 0; group /= 2) {
            for (int i = 0; i < group; i++){  //循环组的偏移量
                for (int j = i + group; j < array.length; j += group ){ //循环组偏移量串 每次循环排序当前以及之前的对应串
                    int temp = array[j];
                    for (x = j - group; x >= 0 && temp < array[x]; x -= group){ //插入排序，占坑方式，插入排序增量是1  这个是group
                        count++;
                        array[x + group] = array[x];
                    }
                    array[x + group] = temp;
                }
            }
        }
        return count;
    }

}
