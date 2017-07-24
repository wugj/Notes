package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author��Administrator
 * @date: 2017-07-20 17:07
 * @company: �Ϻ������Ƽ����޹�˾
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
            int temp = array[i]; //s[l]��s[i]���ǵ�һ����
            while (i < j){
                while (i < j  && array[j] >  array[i] ){// ����������С��x��������s[i]
                    j--;
                    count++;
                }
                if (i < j){
                    swap(array, i, j);//��s[j]�s[i]�У�s[j]���γ���һ���µĿ�
                    i++;
                }
                while (i < j && array[i] < array[j]){// ���������Ҵ��ڻ����x��������s[j]
                    i++;
                    count++;
                }
                if (i < j){
                    swap(array, i, j);//��s[i]�s[j]�У�s[i]���γ���һ���µĿ�
                    j--;
                }
            }
            array[i] = temp;  //�˳�ʱ��i����j����temp�������С�
            AdjustArray(array, l, i - 1);
            AdjustArray(array, i + 1, r);
        }
    }

}
