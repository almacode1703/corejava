import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        // Sum of n numbers
        System.out.println("Enter a number: ");

        Scanner scn = new Scanner(System.in);
        int     num = scn.nextInt();
        int     sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of " + num + " numbers is: " + sum);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
