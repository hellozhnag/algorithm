package org.algorithm.binarysearch;

public class leetcode35 {
    public static void main(String[] args) {
        int[] a={1,3,5};
        System.out.println(leetcode35.searchInsert(a, 2)); //1
    }
    public static int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target < nums[m]){
                j=m-1;
            }else if(target > nums[m]){
                i=m+1;
            }
            else return m;
        }
        return i;
    }
}
