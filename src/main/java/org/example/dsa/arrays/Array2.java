package org.example.dsa.arrays;

public class Array2 {
    public static void main(String[] args) {
        int arr[]={5,6,6,7};
        int x=5;

//        int count= frequencyOfElement(arr,x);
//        System.out.println(count);

//        int last= lastOccurance(arr,x);
//        System.out.println(last);

//        int countStrictly= countStrictlyGreater(arr,x);
//        System.out.println(countStrictly);

        System.out.println(isSorted(arr));
    }

    static int frequencyOfElement(int arr[],int x){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurance(int arr[], int x){
        int lastIdx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                lastIdx=i;
            }

        }
        return lastIdx;
    }

    static int countStrictlyGreater(int arr[], int x){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int arr[]){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }

}
