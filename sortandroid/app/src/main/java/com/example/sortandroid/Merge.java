package com.example.sortandroid;

public class Merge implements Sort{
    public int thutu = 0;
    public void sort (int[] arr, int n, String[] Chitiet)
    {
        sort1(arr,0,n, thutu, Chitiet);
    }
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    void sort1(int arr[], int l, int r, int thutu, String[] Chitiet)
    {
        if (l < r) {
            int m = (l + r) / 2;
            sort1(arr, l, m, thutu,Chitiet);
            sort1(arr, m + 1, r, thutu,Chitiet);
            merge(arr, l, m, r);
            in(arr,Chitiet);
        }
    }
    void in(int arr[], String[] Chitiet)
    {
        String s = "i = " + String.valueOf(thutu+1) + " :";
        for (int m=0;m<arr.length;m++)
        {
            s+= " " + String.valueOf(arr[m]);
        }
        Chitiet[thutu++] = s;
    }
}
