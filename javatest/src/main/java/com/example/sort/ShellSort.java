package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author��Administrator
 * @date: 2017-07-20 17:07
 * @company: �Ϻ������Ƽ����޹�˾
 */

public class ShellSort extends BaseSort implements SortDao {

    private int count;

    @Override
    public int sort(int[] array) {
        count = 0;
        int x;
        for (int group = (int) Math.ceil(array.length / 2); group > 0; group /= 2) {
            for (int i = 0; i < group; i++){  //ѭ�����ƫ����
                for (int j = i + group; j < array.length; j += group ){ //ѭ����ƫ������ ÿ��ѭ������ǰ�Լ�֮ǰ�Ķ�Ӧ��
                    int temp = array[j];
                    for (x = j - group; x >= 0 && temp < array[x]; x -= group){ //��������ռ�ӷ�ʽ����������������1  �����group
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
