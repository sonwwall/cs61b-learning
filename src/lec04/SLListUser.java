package lec04;

public class SLListUser{
    public static void main(String[]args){
        SLList L=new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        //L.first    private你不能直接访问
        System.out.println(L.getFirst());
    }

}