package lec04;

public class SLList{
    //嵌套类
    //这里加上static就不能访问IntNode以外的东西了
    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item=i;
            next=n;
        }
    }

    //first item in the list
    private IntNode first;

    public SLList(int x){
        first=new IntNode(x,null);
    }

    public void addFirst(int x){
        first=new IntNode(x,first);
    }

    public void addLast(int x){
        IntNode p=first;

        while(p.next!=null){
            p=p.next;
        }
        p.next=new IntNode(x,null);
    }

    public int getFirst(){
        return first.item;
    }

    public int size(){
        return size(first);
    }

    public int size(IntNode p){
        if(p==null){
            return 0;
        }
        return 1+size(p.next);
    }



}