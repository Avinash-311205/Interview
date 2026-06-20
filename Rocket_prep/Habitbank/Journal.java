package rocket_practice.Habitbank;

public class Journal {
    private int journalId;
    private String entry;
    private String date;
    private Habit habit;

    public Journal(int journalId, String entry, String date, Habit habits){
        this.journalId = journalId;
        this.entry = entry;
        this.date = date;
        this.habit = habits;
    }
    public void addEntry(){
        System.out.println("Journal Entry: " + entry);
        System.out.println("Date: " + date);
        System.out.println("Habit: " + habit.getHabitName());
    }
    public void viewEntry(){
        System.out.println("Journal ID: " + journalId);
        System.out.println("Journal Entry: " + entry);
        System.out.println("Date: " + date);
        System.out.println("Habit: " + habit.getHabitName());
    }
    public String toString(){
        return "Journal{" +
                "journalId= " + journalId +
                ", entry= " + entry +
                ", date= " + date +
                ", habit= " + habit.getHabitName() +
                "}";
    }
}
