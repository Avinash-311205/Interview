package rocket_practice.Piggybank;
import java.util.*;

public class PiggyBank {
    ArrayList<User> usersList = new ArrayList<>();
    ArrayList<Account> accountList = new ArrayList<>();
    ArrayList<SavingGoals> goalList = new ArrayList<>();
    ArrayList<ExpenseTracker> expenselist = new ArrayList<>();
    ArrayList<SavingChallenge> challengeList = new ArrayList<>();

    public PiggyBank(){
    User u1 = new User("Avinash", "avinash@gmail.com", "12345678");
    usersList.add(u1);

    Account acc = new Account("Saving", 24523134, 230.2f);
    accountList.add(acc);

    SavingGoals sg = new SavingGoals(1, "car", 24333, 23);
    goalList.add(sg);

    ExpenseTracker exp = new ExpenseTracker(1, "food", 200);
    expenselist.add(exp);

    SavingChallenge sc = new SavingChallenge(1, "festival");
    challengeList.add(sc);
    }

    public void viewuser(){
        for (User u : usersList){
            u.displayuser();
        }
    }
    public void viewacc(){
        for(Account a : accountList){
            a.viewacc();
        }
    }

    public void seeprogress(){
        for(SavingGoals s : goalList){
            s.seeprogress();
        }
    }
    public void viewExpense(){
        for(ExpenseTracker e : expenselist){
            e.viewExpense();
        }
    }
    public void viewchallenge(){
        for(SavingChallenge c : challengeList){
            c.viewchallenge();
        }
    }
}

