package org.algorithm.binarysearch;

public class demo2 {
    public static void main(String[] args) {
        int[] a={0,1,2,4,4,4,6,7,9,10};
        // 找出最左侧索引
        System.out.println(leftMost1(a,4)); //3
        System.out.println(leftMost2(a,4)); //3

        // 找出最右侧索引
        System.out.println(rightMost1(a,4));//5
        System.out.println(rightMost2(a,4));
    }

    public static int leftMost1(int[] a,int target){
        int i=0,j=a.length-1;
        int ans=-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<a[m]){
                j=m-1;
            }else if(target>a[m]){
                i=m+1;
            }else{
                ans=m;
                j=m-1; // 继续向左
            }
        }
        return ans;
    }

    //leftmost 返回值的另一层含义： ＞target 的元素个数
    public static int leftMost2(int[] a,int target){
        int i=0,j=a.length-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<=a[m]){
                j=m-1;
            }else {
                i=m+1;
            }
        }
        return i;
    }

    public static int rightMost1(int[] a,int target){
        int i=0,j=a.length-1;
        int ans=-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<a[m]){
                j=m-1;
            }else if(target>a[m]){
                i=m+1;
            }else{
                ans=m;
                i=m+1;
            }
        }
        return ans;
    }

    public static int rightMost2(int[] a,int target){
        int i=0,j=a.length-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<a[m]){
                j=m-1;
            }else {
                i=m+1; //大于等于中间值，都要向右找
            }
        }
        return i-1;
    }
}
