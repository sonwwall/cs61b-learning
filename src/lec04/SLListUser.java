package lec04;

public class SLListUser{
    public static void main(String[]args){
        SLList<String> L=new SLList<>();//因为前面使用了泛型，这里需要指定类型，并且必须是引用类型，int需要使用Integer
       // L.addLast(100);
        L.addFirst("hello");
        L.addFirst("world");
        L.addLast("sonwwall");
        //L.first    private你不能直接访问
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.size());
    }

}