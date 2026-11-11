package org.example.dsa.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={-3,0,-1,-2,-4};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i] !=max) {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
