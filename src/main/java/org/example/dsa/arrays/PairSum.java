package org.example.dsa.arrays;

public class PairSum {
    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};
        int x=7;
        int count = targetSum(arr,x);
        System.out.println(count);
    }
    static int targetSum(int arr[], int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
}
