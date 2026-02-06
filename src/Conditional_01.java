import java.util.Scanner;

public class Conditional_01 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scn = new Scanner(System.in);
       int num = scn.nextInt();

       if(num > 10){
           System.out.println("Input is greater than 10");
       }
       else{
           System.out.println("Input is less than 10");
       }
    }
}
