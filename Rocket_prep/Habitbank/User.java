package rocket_practice.Habitbank;

public class User {
    private String name;
    private String password;
    private int usrid;

    public User(String name, String password, int usrid){
        this.name = name;
        this.password = password;
        this.usrid = usrid;
    }

    public void login(String name, String password){
        if(this.name.equals(name) && this.password.equals(password)){
            System.out.println("Login successful");
        }else{
            System.out.println("Login Failed");
        }
    }
    public void displayuser(){
        System.out.println("Name: " + name);
        System.out.println("User ID: " + usrid);
    }
}
