package org.example.dsa.arrays.twopointers;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int arr[]= {1,0,1,0,0,1,0,1,0};
        sortZerosAndOnes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void sortZerosAndOnes(int arr[]){
        int n= arr.length;
        int zeroes=0;

        //Count no. of Zeroes
        for (int i = 0; i < n; i++) {
            if(arr[i] ==0){
                zeroes++;
            }
        }

        //0 to zeroes-1 :0, zeroes to n-1 : 1
        for (int i = 0; i < n; i++) {
            if(i<zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }
}
