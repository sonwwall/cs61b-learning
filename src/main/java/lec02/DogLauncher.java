package lec02;



public class DogLauncher{
    public static void main(String[]args){
        Dog maya=new Dog(40);
        maya.makeNoise();

        Dog dogmeat=new Dog(2000);
        dogmeat.makeNoise();

        Dog hugeDog=Dog.largerDog(maya,dogmeat);
        hugeDog.makeNoise();
    }
}