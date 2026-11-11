package org.example.dsa.arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int arr[]={1,5,2,7,7,3,4,2,1,3,5};
        System.out.println(uniqueNumber(arr));
    }
    static int uniqueNumber(int arr[]){
        int unique=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                unique=arr[i];
            }
        }
        return unique;
    }
}
