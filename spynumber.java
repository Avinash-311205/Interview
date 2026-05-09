import java.util.Scanner;

public class spynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int digit;

        while (num > 0){
            digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }

        if (sum == product){
            System.out.println("Spy number");
        } else{
            System.out.println("Not a spy");
        }
        sc.close();
    }
}
