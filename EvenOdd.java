import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scan.nextInt();
        if (n%2==0){
            System.out.print("It is a even number");
        }
        else{
            System.out.print("It is a odd number");
        }
    }
}