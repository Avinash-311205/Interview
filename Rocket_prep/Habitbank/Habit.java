package rocket_practice.Habitbank;

public class Habit {

    private int habitId;
    private String habitName;
    private int goalDays;
    private String frequency;
    private int streak;

    public Habit(int habitId, String habitName, int goalDays, String frequency, int streak){
        this.habitId = habitId;
        this.habitName = habitName;
        this.goalDays = goalDays;
        this.frequency = frequency;
        this.streak = streak;
    }

    

    public void viewHabit(){
        System.out.println("Habit ID: " + habitId);
        System.out.println("Habit Name: " + habitName);
        System.out.println("Goal Days: " + goalDays);
        System.out.println("Frequency: " + frequency);
        System.out.println("Streak: " + streak);
    }
    public String getHabitName(){
        return habitName;
        
    }
}
