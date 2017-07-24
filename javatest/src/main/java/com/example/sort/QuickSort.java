package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author：Administrator
 * @date: 2017-07-20 17:07
 * @company: 上海若美科技有限公司
 */

public class QuickSort extends BaseSort implements SortDao {

    private int count;

    @Override
    public int sort(int[] data) {
        count = 0;
        AdjustArray(data, 0, data.length - 1);
        return count;
    }

    private void AdjustArray(int[] array, int l, int r){

        if (l < r ){
            int i = l, j = r;
            int temp = array[i]; //s[l]即s[i]就是第一个坑
            while (i < j){
                while (i < j  && array[j] >  array[i] ){// 从右向左找小于x的数来填s[i]
                    j--;
                    count++;
                }
                if (i < j){
                    swap(array, i, j);//将s[j]填到s[i]中，s[j]就形成了一个新的坑
                    i++;
                }
                while (i < j && array[i] < array[j]){// 从左向右找大于或等于x的数来填s[j]
                    i++;
                    count++;
                }
                if (i < j){
                    swap(array, i, j);//将s[i]填到s[j]中，s[i]就形成了一个新的坑
                    j--;
                }
            }
            array[i] = temp;  //退出时，i等于j。将temp填到这个坑中。
            AdjustArray(array, l, i - 1);
            AdjustArray(array, i + 1, r);
        }
    }

}
