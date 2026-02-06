import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("You got : A+");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("You got : A");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("You got B");
        } else {
            System.out.println("C");
        }
    }
}
