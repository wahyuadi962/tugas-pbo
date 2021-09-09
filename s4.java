import java.util.Arrays;

public class s4  {
    public static void main(String[] args) {
        
        //input ksatria        
        int[] H = { 8,3,1,2 };
        Arrays.sort(H);
        int N = 0;

        //input dragon
        int[] D = { 7, 2 };
        Arrays.sort(D);
        int indeksD  = 0;
        for (int x : H ){
            if (indeksD < D.length){
                if (x >= D[indeksD]){
                    N += x;
                    indeksD++;
                }
            }
        }
        if (indeksD == D.length){
            System.out.println( N);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }

}