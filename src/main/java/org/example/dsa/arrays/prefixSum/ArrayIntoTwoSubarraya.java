package org.example.dsa.arrays.prefixSum;

public class ArrayIntoTwoSubarraya {
    public static void main(String[] args) {
        int arr[]= {1,1,1,1,1,1};
       boolean a= equalSumPartition(arr);
        System.out.println(a);
    }
    static boolean equalSumPartition(int arr[]){
        int totalSum=findArraySum(arr);

        int prefSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefSum+=arr[i];
            int suffixSum= totalSum-prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }

    static int findArraySum(int arr[]){
        int totalSum=-0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
}
