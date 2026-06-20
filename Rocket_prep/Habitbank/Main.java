package rocket_practice.Habitbank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HabitTrackerApp app = new HabitTrackerApp();

        while(true){

            System.out.println("\n=== Habit Tracker ===");
            System.out.println("1. Create User");
            System.out.println("2. Add Habit");
            System.out.println("3. View Users");
            System.out.println("4. View Habits");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.println("Enter user name:");
                    String name = sc.nextLine();

                    System.out.println("Enter password:");
                    String password = sc.nextLine();

                    System.out.println("Enter user id:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    User u = new User(name, password, id);
                    app.addUser(u);

                    System.out.println("User added successfully!");
                    break;

                case 2:

                    System.out.println("Enter habit id:");
                    int habitId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter habit name:");
                    String habitName = sc.nextLine();

                    System.out.println("Enter goal days:");
                    int goalDays = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter frequency:");
                    String frequency = sc.nextLine();

                    Habit h = new Habit(habitId, habitName, goalDays, frequency, 0);
                    app.addHabit(h);

                    System.out.println("Habit added successfully!");
                    break;

                case 3:
                    app.viewuser();
                    break;

                case 4:
                    app.viewHabit();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}