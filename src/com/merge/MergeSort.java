package com.merge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        // write your code here
        int arr[] = {8, 3, 2, 9, 7, 1, 5, 4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {

        if(arr.length>1) {
            int length = arr.length;
            int l1 = length / 2;
            int l2 = length - l1;
            int[] arr1 = new int[l1];
            int[] arr2 = new int[l2];
            arr1 = Arrays.copyOfRange(arr, 0, l1);
            arr2 = Arrays.copyOfRange(arr, l1, length);
            //System.out.println(Arrays.toString(arr1) + "   " + Arrays.toString(arr2));

            mergeSort(arr1);
            mergeSort(arr2);
            merge(arr1, arr2, arr);


        }

    }

    static void merge(int[] B, int[] C, int[] A) {
        int i = 0, j = 0, k = 0;
         System.out.println(Arrays.toString(B)+" C is "+Arrays.toString(C));

        while (i < B.length && j < C.length) {
            if (B[i] < C[j]) {
                A[k] = B[i];
                System.out.println("B "+B[i]);
                i++;

            } else {
                A[k] = C[j];
                System.out.println("C "+C[j]);

                j++;
            }
            k++;

        }
        if (i < B.length ) {
            //copy remaining elements of B into A
            for (int a = i; a < B.length; a++) {
                A[k] = B[a];
                //System.out.println(A[k]+" aloop "+B[a]);
                k++;
            }
        }
        else {
            //copy remaining elements of C into A
            for (int b= j; b < C.length; b++) {
                A[k] = C[b];
               // System.out.println(A[k]+" bloop "+C[b]);

                k++;
            }
        }

        System.out.println(Arrays.toString(A));
        }

    }

