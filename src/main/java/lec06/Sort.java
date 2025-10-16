package lec06;

public class Sort {
    public static void sort(String[] x) {
        sort(x, 0);
    }

    //可以写一个辅助方法
    //从索引s开始排序x
    private static void sort(String[]x ,int s){
        if(s==x.length){
            return;
        }
        int smallest=findSmallest(x,s);
        swap(x,s,smallest);
        sort(x,s+1);
    }

    //第二个参数是寻最小开始的位置
    public static int findSmallest(String[] x,int s) {
        int smallestIndex=s;
        for(int i=s;i<x.length;i++){
            if(x[i].compareTo(x[smallestIndex])<0){
                smallestIndex=i;
            }
        }

        return smallestIndex;
    }

    public static void swap(String[]x,int a,int b){
        String temp=x[a];//这个变量名是临时的意思
        x[a]=x[b];

        x[b]=temp;
    }
}
