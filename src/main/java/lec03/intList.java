package lec03;

public class intList {
    public int first;
    public intList rest;

    public intList(int f,intList r){
        first=f;
        rest=r;
    }

    public int size(){
        if (rest==null){
            return 1;
        }
        return 1+rest.size();
    }

    public int iterativeSize(){
        int total=0;
        intList p=this;
        while(p!=null){
            total++;
            p=p.rest;
        }
        return total;
    }

    public int get(int i){
        int total=0;
        intList p=this;
        while(total!=i){
            total++;
            p=p.rest;
        }
        return p.first;
    }

    public int gteer(int i){
        if(i==0){
            return first;
        }
        return rest.gteer(i-1);
    }

    public static void main(String[] args) {
        intList L=new intList(15,null);
        L=new intList(10,L);
        L=new intList(5,L);

        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
        System.out.println(L.gteer(1));
    }
}