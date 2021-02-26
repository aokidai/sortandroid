package com.example.androidgki;

public class InterchageSort implements Sort{
    @Override
    public void sort(int[] arr, int n, String[] Chitiet) {

        for (int i = 0; i < n-1;i++) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    swap(arr[i], arr[j]);
            String s = "i = " + String.valueOf(i) + " :";
            for (int m=0;m<arr.length;m++)
            {
                s+= " " + String.valueOf(arr[m]);
            }
            Chitiet[i-1] = s;
        }

    }
    void swap(int a, int b)
    {
        int x = a;
        a = b;
        b = x;
    }

}
