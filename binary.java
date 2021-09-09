import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);   
        System.out.print("Input bilangan : ");
        int bilangan = scan.nextInt();
        int index = 0;
        int[] binary = { 7, 8, 9, 10, 11, 19, 30 };
        int binaryLen = binary.length;
        for (int x : binary) { 
            if (bilangan == x) {
                System.out.println("bilangan ini ada di indeks ke  " + index);
                break;
            }
            index++;
        }
        if (index == binaryLen) {
            System.out.println("bilangan ini tidak ada dalam array!");
        }
    }
}
