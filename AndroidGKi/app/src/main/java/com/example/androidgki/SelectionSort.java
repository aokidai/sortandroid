package com.example.androidgki;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr, int n, String[] Chitiet) {
        for (int i = 0;i<n-1;i++)
        {
            int index = i;
            for (int j= i+1;j<n;j++)
            {
                if (arr[j]<arr[index])
                {
                    index = j;
                }
            }
            if (index!=i)
            {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
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
