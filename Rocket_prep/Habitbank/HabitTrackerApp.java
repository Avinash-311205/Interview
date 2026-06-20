package rocket_practice.Habitbank;

import java.util.ArrayList;

public class HabitTrackerApp {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Habit> habits = new ArrayList<>();
    ArrayList<Journal> journals = new ArrayList<>();
    ArrayList<Community> communities = new ArrayList<>();
    ArrayList<Remainder> remainders = new ArrayList<>();
    ArrayList<Reward> rewards = new ArrayList<>();

    public void addUser(User u){
        users.add(u);
    }

    public void addHabit(Habit h){
        habits.add(h);
    }

    public void addjournal(Journal j){
        journals.add(j);
    }

    public void addcommunity(Community c){
        communities.add(c);
    }

    public void addremainder(Remainder r){
        remainders.add(r);
    }
    public void addreward(Reward r){
        rewards.add(r);
    }

    public void viewuser(){
        for(User u : users){
            u.displayuser();
        }
    }
    public void viewHabit(){
        for(Habit h: habits){
            h.viewHabit();
        }

    }

    public void viewEntry(){
        for(Journal j: journals){
            j.viewEntry();
        }
    }

    public void viewreward(){
        for(Reward r: rewards){
            r.viewreward();
        }
    }
    
    public void viewcommunity(){
        for(Community c : communities){
            c.viewcommunity();
        }
    }
    
}
