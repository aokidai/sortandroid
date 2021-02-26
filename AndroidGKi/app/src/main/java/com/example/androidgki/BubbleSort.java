package com.example.androidgki;

import java.util.ArrayList;

public class BubbleSort implements Sort {


    @Override
    public void sort(int[] arr, int n, String[] Chitiet) {
        for (int i=0;i<n-1;i++)
        {
            for (int j = n-1;j>i;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            String s = "i = " + String.valueOf(i+1) + " :";
            for (int m=0;m<arr.length;m++)
            {
                s+= " " + String.valueOf(arr[m]);
            }
            Chitiet[i] = s;
        }
    }
}
