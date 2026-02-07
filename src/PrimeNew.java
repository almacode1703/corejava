import java.util.Scanner;
public class PrimeNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lowest range :");
        int low = sc.nextInt();
        System.out.print("Enter upper limit :");
        int high = sc.nextInt();
        for(int n = low;n<=high;n++){
            int count = 0;
            for(int div = 2;div*div<=n;div++){
                if(n%div ==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}
