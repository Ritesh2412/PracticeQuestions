package org.example.dsa.arrays;

public class TripletSum {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        int x= 12;
        System.out.println(tripletSum(arr,x));
    }

    static int tripletSum(int arr[], int x){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
