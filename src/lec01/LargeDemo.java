public class LargeDemo{
    public static int larger(int x,int y){
        if (x>y){
            return x;
        }
        return y;
    }

    public static void main(String[] args){
        System.out.println(larger(3,4));
    }
}