package com.example.androidgki;

import android.media.DrmInitData;

public class MergeSort implements Sort{
//    public int thutu = 0;
//    public void sort (int[] arr, int n, String[] Chitiet)
//    {
//        sort1(arr,0,n, thutu, Chitiet);
//    }
//    ///////////////////////////////////////////////////////
//    void merge(int arr[], int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        /* Create temp arrays */
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        /*Copy data to temp arrays*/
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        /* Merge the temp arrays */
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarry array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    void sort1(int arr[], int l, int r, int thutu, String[] Chitiet)
//    {
//        if (l < r) {
//            // Find the middle point
//            int m = (l + r) / 2;
//
//            // Sort first and second halves
//            sort1(arr, l, m, thutu,Chitiet);
//            sort1(arr, m + 1, r, thutu,Chitiet);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//            in(arr,Chitiet);
//        }
//    }
//    void in(int arr[], String[] Chitiet)
//    {
//        String s = "i = " + String.valueOf(thutu+1) + " :";
//        for (int m=0;m<arr.length;m++)
//        {
//            s+= " " + String.valueOf(arr[m]);
//        }
//        Chitiet[thutu++] = s;
//    }
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