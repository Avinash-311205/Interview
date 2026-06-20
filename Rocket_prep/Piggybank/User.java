package rocket_practice.Piggybank;

import java.util.*;
public class User {
    private String name;
    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void login(){
        String loemail;
        String lopassword;
        System.out.println("Enter Login email id: ");
        loemail = sc.nextLine();
        System.out.println("Enter Login Password: ");
        lopassword = sc.nextLine();
        if(email.equals(loemail) && password.equals(lopassword)){
            System.out.println("Login successful");
        }else{
            System.out.println("Login failed");
        }
    }

    public void displayuser(){
        System.out.println("Name: " + name);
        System.out.println("email: " + email);
    }

}
