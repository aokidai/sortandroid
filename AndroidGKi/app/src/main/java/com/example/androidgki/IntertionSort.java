package com.example.androidgki;

public class IntertionSort implements Sort {
    @Override
    public void sort(int[] arr, int n, String[] Chitiet) {
        int i,j,k;
        for(i = 1;i <n;++i) {
            k = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > k) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
            String s = "i = " + String.valueOf(i) + " :";
            for (int m=0;m<arr.length;m++)
            {
                s+= " " + String.valueOf(arr[m]);
            }
            Chitiet[i-1] = s;
        }
    }
}
