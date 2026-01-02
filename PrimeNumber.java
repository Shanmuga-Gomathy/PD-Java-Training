import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int flag= 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scan.nextInt();
        if (n <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}
