package org.algorithm.binarysearch;

public class demo1 {
    public static void main(String[] args) {
        int[] a={0,1,2,4,6,7,9,10};
        System.out.println(demo1.solution1(a,4)); //3
        System.out.println(demo1.solution2(a,4)); //3
        System.out.println(demo1.solution3(a,4)); //3
    }
    public static int solution1(int[] a,int target){
        int i=0;
        int j=a.length-1;
        int m=-1;
        while (i<=j){
            m=(i+j)>>>1; // m向下取整
            if (target < a[m]){
                j=m-1;
            }else if (target > a[m]){
                i=m+1;
            }
            else {
                return m; //返回索引
            }
        }
        return -1;
    }
    public static int solution2(int[] a,int target){
        int i=0;
        int j=a.length;// 索引j对应的值不在解范围内
        while(i<j){ // 不需要=
            int m=(i+j)>>>1; // m向下取整
            if (target < a[m]){
                j=m;
            }else if (target > a[m]){
                i=m+1;
            }else {
                return m;
            }
        }
        return -1;
    }

    public static int solution3(int[] a,int target){
        int i=0;
        int j=a.length;
        while(1<j-i){
            int m=(i+j)>>>1;
            if (target < a[m]){
                j=m;
            }
            else{
                i=m; //解可为i
            }
        }
        return a[i]==target?i:-1;
    }
}
