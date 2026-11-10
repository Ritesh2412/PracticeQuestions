package org.example.dsa.arrays;

public class Array1 {
    public static void main(String[] args) {
        sumOfArray();

        int max= maximumNumber();
        System.out.println(max);

        System.out.println(maximumNumber());

        indexOfArray();


    }

    static void sumOfArray(){
        int arr[]= {1,4,5};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

    static int maximumNumber(){
        int arr[]={1,5,3};
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    static void indexOfArray(){
        int arr[]={1,5,3};
        int x=5;
        int ans=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("Index " + ans);
    }

}
