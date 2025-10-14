package lec05;

import java.util.Arrays;

public class arrayTrys {
    public static void main(String[] args) {
        int[]z=null;
        int[]x,y;
        x=new int[]{1,2,3,4,5};
        y=x;//复制了一份引用，指向的还是同一个数组
        x=new int[]{-1,2,5,6,7};//指向直接变化，指向新的数组
        y=new int[3];
        z=new int[0];//指向一个空数组（长度为0）

        int xL=x.length;//唯一的方法
        String[]s=new String[6];
        s[4]="hello";//String也是引用，这里存的是引用，指向字符串的地内存地址
        s[x[3]-x[1]]="world";

        int[]b={9,10,11};
        System.arraycopy(b,0,x,3,2);//从x的下表为3的开始复制，粘贴到b下标为0的位置，复制粘贴的长度为2
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s));

        System.out.println(y[0]);
    }
}
