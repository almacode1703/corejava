import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("User Input : " +str);
        int num = scn.nextInt();
        System.out.println("User input : "+num);
        float number = scn.nextFloat();
        System.out.println("User input : "+number);
    }
}
