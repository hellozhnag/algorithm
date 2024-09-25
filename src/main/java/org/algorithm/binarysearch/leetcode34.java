package org.algorithm.binarysearch;

public class leetcode34 {
    public static void main(String[] args) {
        int[]  a={1,2,3,3,3,4};
        a=leetcode34.searchRange(a,3);
        System.out.println(a[0]);
        System.out.println(a[1]);

    }
    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int leftmost=-1,rightmost=-1;
        while (left <= right) {
            int mid = (right + left) >>>1;
            if(target <nums[mid]) right = mid - 1;
            else if(target > nums[mid]) left = mid + 1;
            else {
                leftmost = mid;
                right=mid - 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) >>>1;
            if(target < nums[mid]) right = mid - 1;
            else if(target > nums[mid]) left = mid + 1;
            else {
                rightmost = mid;
                left = mid + 1;
            }
        }
        return new int[]{leftmost, rightmost};
    }

}
