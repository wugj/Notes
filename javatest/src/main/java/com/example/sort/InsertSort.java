package com.example.sort;

/**
 * @name: com.example.sort
 * @description:
 * @author��Administrator
 * @date: 2017-07-20 17:07
 * @company: �Ϻ������Ƽ����޹�˾
 */

public class InsertSort extends BaseSort implements SortDao {

    private int count;

    @Override
    public int sort(int[] data) {
        count = 0;
        for (int i = 1; i < data.length; i++){//��һ�β������1λ�ü��ӵ�λ��         ÿ���Ǹ��ӵ�λ�õ�ֵ���бȽ�
            if (data[i] < data[i - 1]){
                int temp = data[i];
                int j = i; //��¼�յĿӽǱ�
                do {
                    count++;
                    data[j] = data[j-1];  //�ƶ����յĿ�
                    j--;
                }while (j >0 && data[j - 1] > temp);
                data[j] = temp;
            }
        }
        return count;
    }

}
