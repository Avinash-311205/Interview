import java.util.*;
public class automorphicnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int square = num * num;
        while (num > 0){
            int digit = num % 10;
            int last = square % 10;
            if (digit == last){
                System.out.println("Automorphic number");
            }else{
                System.out.println("Not");
            }
        }
    }
}
