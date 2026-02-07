import java.util.Scanner;
public class MinMAx {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int min  = Integer.MAX_VALUE;
        int max  = Integer.MIN_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = scn.nextInt();

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }
            System.out.print("Do you want to continue (y/n)?");
            choice = scn.next().charAt(0);
        }
        while( choice == 'y' || choice == 'Y' );
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
