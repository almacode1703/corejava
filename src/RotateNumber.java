import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();

        System.out.print("Enter rotation k: ");
        int k = scn.nextInt();

        // count digits
        int temp = n;
        int digits = 0;
        while(temp > 0) {
            temp /= 10;
            digits++;
        }

        // handle large or negative k
        k = k % digits;
        if(k < 0) k = k + digits;

        // divisor & multiplier
        int div = (int)Math.pow(10, k);
        int mul = (int)Math.pow(10, digits - k);

        // split number
        int r = n % div;  // last k digits
        int q = n / div;  // remaining digits

        // rotate
        int rotated = r * mul + q;

        System.out.println("Rotated number = " + rotated);
    }
}
