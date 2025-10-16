package hw00;

public class BreakContinue {
    public static int[] windowPosSum(int[] ab, int n) {
        for(int i=0;i<ab.length;i++){
            if(ab[i]<0){
                continue;
            }
            int sum=ab[i];
            for(int j=i+1;j<=i+n;j++){
                if(j>=ab.length){
                    break;
                }
                sum+=ab[j];
            }
            ab[i]=sum;
        }
        return ab;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        System.out.println(java.util.Arrays.toString(windowPosSum(a, n)));

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}