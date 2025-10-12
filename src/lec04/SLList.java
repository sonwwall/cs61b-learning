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

    //这是一个虚拟节点放在list前面
    //真正的第一个元素是sentinel.next
    private IntNode sentinel;
    private int size;

    public SLList(int x){
        sentinel =new IntNode(0,null);
        sentinel.next=new IntNode(x,null);
        size=1;
    }

    public void addFirst(int x){
        sentinel.next =new IntNode(x, sentinel.next);
        size++;
    }

    public void addLast(int x){

        IntNode p= sentinel;

        while(p.next!=null){
            p=p.next;
        }
        p.next=new IntNode(x,null);
        size++;
    }

    public int getFirst(){
        return sentinel.item;
    }

    public int size(){
        return size;
    }

    public SLList(){
        sentinel =new IntNode(0,null);//这个数字并不重要，只是必须有一个在这里罢了
        size=0;
    }





}