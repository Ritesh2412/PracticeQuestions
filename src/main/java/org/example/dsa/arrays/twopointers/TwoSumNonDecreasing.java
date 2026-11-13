package org.example.dsa.arrays.twopointers;

public class TwoSumNonDecreasing {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=twoSumNonDecreasing(arr,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    static int[] twoSumNonDecreasing(int arr[], int target){
        int n= arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return new int[] {left+1,right+1};
            } else if (sum>target) {
                right--;
            }else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
