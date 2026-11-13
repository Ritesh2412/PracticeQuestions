package org.example.dsa.arrays.twopointers;

public class MoveEvenFirstThenOdd {
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7};
        moveEvenOdd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static void moveEvenOdd(int arr[]){
        int n= arr.length;
        int l=0;
        int r=n-1;

        while(l<r){
            if (arr[l]%2==1 && arr[r]%2==0){
                swap(arr,l,r);
                l++;
                r--;
            }
            if (arr[l]%2==0){
                l++;
            }
            if (arr[r]%2==1){
                r--;
            }
        }
    }
    static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
