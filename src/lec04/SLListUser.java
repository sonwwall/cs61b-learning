package lec04;

public class SLListUser{
    public static void main(String[]args){
        SLList L=new SLList();
        L.addLast(100);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        //L.first    private你不能直接访问
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.size());
    }

}