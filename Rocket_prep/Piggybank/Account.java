package rocket_practice.Piggybank;
import java.util.*;
public class Account {
    private String type;
    private long Accno;
    private float balance;
    Scanner sc = new Scanner(System.in);

    public Account(String type, long Accno, float balance){
        this.type = type;
        this.Accno = Accno;
        this.balance = balance;
    }
    public void viewacc(){
        System.out.print("Account type: " +type);
        System.out.print("Account number: " +Accno);
        System.out.print("Account balance: " +balance);
    }
    public void addcash(){
        int cash;
        System.out.print("Enter cash to deposit: ");
        cash = sc.nextInt();
        System.out.print("Cash added successfully");

        balance += cash;

    }

    public void viewbalance(){
        System.out.println("current balance= " + balance);
    }
}
