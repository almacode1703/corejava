import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scn.nextInt();

        if(num % 2 == 0){
            System.out.println("Even Numver");
        }
        else{
            System.out.println("Odd  Number");
        }

    }
}
