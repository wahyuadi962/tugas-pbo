import java.util.Scanner;

public class prima{

  public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);   
      System.out.print("Input bilangan : ");
      int bilangan = scan.nextInt();
      int n = 0;
      if (bilangan >= 2) {
          for (int x = 1; x <= bilangan; x++) {
                int m = bilangan % x;
                if (m == 0) {
                    n++;
                }
            }
            if (n == 2) {
                System.out.print(bilangan + " adalah bilangan prima");
            } else {
                System.out.print(bilangan + " adalah bilangan bukan prima ");
            }
        } else {
            System.out.print(bilangan + " adalah bilangan bukan prima");
        }
    }
}