package lec05;

import java.util.Arrays;

public class TwoDArrays{
    public static void main(String[] args){
        int[] i;//一维
        i=new int[3];
        int[][] ii;//二维(int[])[]数组的数组
        ii=new int[3][3];

        int[][] pascalsTriangle;
        pascalsTriangle=new int[4][];//可以保存四个数组（的引用）

        //我们来区分一下这两个写法
        int[][] d1,d2;
        //这一种是把内层数组也初始化了，都初始化为0
        //d1 ──► [
        //  [0, 0, 0, 0],
        //  [0, 0, 0, 0],
        //  [0, 0, 0, 0],
        //  [0, 0, 0, 0]
        //]
        d1=new int[4][4];//实际上创建了五个数组
        //这一种仅仅初始化了外层数组
        //d2 [null,null,null,null]
        d2=new int[4][];//实际上只创建了一个数组
        //对于第一种写法
        //为什么不报错呢？
        //因为你之前初始化了一个数组，这是重新指向了一个新数组，又都是存的引用，相当于之前的初始化没用了
        d1[0]=new int[]{1,2,3,4,5,6};

        int[] rowZero=pascalsTriangle[0];

        pascalsTriangle[0]=new int[]{1,2,3,4};
        pascalsTriangle[1]=new int[]{2,3,4,5};
        pascalsTriangle[2]=new int[]{15,6};
        pascalsTriangle[3]=new int[]{1,6,7,8,9,4};

        System.out.println(Arrays.toString(pascalsTriangle[3]));

        int[] rowTwo=pascalsTriangle[2];
        rowTwo[0]=2;

    }
}