package com.example.androidgki;

public class ShellSort implements Sort{
    @Override
    public void sort(int[] arr, int n, String[] Chitiet) {
        int interval, i, j, temp;
        for(interval = n/2; interval > 0; interval /= 2){
            for(i = interval; i < n; i++){
                temp = arr[i];
                for(j = i; j >= interval && arr[j - interval] > temp; j -= interval){
                    arr[j] = arr[j - interval];
                }
                arr[j] = temp;
                String s = "i = " + String.valueOf(i) + " :";
                for (int m=0;m<arr.length;m++)
                {
                    s+= " " + String.valueOf(arr[m]);
                }
                Chitiet[i-1] = s;

            }

        }
    }
}
