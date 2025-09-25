package lec02;

public class Dog{
    public int  weight;

    public Dog(int w){
        weight=w;
    }

    public  void makeNoise(){
        if(weight>50){
            System.out.println("嗷呜嗷呜");
        }else if(weight>20){
            System.out.println("大狗大狗叫叫叫");

        }else{
            System.out.println("汪汪汪");
        }

    }

    public static Dog largerDog(Dog a,Dog b){
        if(a.weight>b.weight){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[]args){

    }
}