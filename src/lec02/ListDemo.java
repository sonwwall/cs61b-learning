package lec02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo{
    public static void main(String[] args) {
        List<String> L=new ArrayList();
        L.add("猫猫");
        L.add("狗狗");
        L.add("猪猪");

        System.out.println(L);
        System.out.println(L.get(0));

        String s=L.get(0);
        System.out.println(s);
    }
}