package org.example.dsa.arrays.twopointers;

public class NonDecreasingAndSquare {
    public static void main(String[] args) {
        int arr[]= {-10,-5,-4,1,2,9};
        int ans[]= nonDecreasingSqaure(arr);
//        reverse(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    static int[] nonDecreasingSqaure(int arr[]){
        int n= arr.length;
        int l=0;
        int r=n-1;

        int ans[]= new int[n];
        int k=0;

        while(l<=r){
            if(Math.abs(arr[l])> Math.abs(arr[r])){
                ans[k++]= arr[l] * arr[l];
                l++;
            }else {
                ans[k++] = arr[r]*arr[r];
                r--;
            }
        }
        reverse(ans);
        return ans;
    }

    static void reverse(int arr[]){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
