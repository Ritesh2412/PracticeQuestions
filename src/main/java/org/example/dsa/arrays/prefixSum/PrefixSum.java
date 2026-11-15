package org.example.dsa.arrays.prefixSum;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[]= {2,1,3,4,5};
        int pref[]=makePrefixSum(arr);
        for (int i = 0; i < pref.length; i++) {
            System.out.print(pref[i]+ " ");
        }

        sumPrefix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    //By creating new array
    static int[] makePrefixSum(int arr[]){
        int n= arr.length;
        int pref[] = new int[n];
        pref[0]=arr[0];

        for (int i = 1; i < n; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;

    }

    static void sumPrefix(int arr[]){
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
    }
}
