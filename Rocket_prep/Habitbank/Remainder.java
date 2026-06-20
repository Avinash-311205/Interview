package rocket_practice.Habitbank;
public class Remainder {
    private int remainderid;
    private String message;
    private String time;
    private Habit habits;

    public Remainder(int remainderid, String message, String time, Habit habits){
        this.remainderid = remainderid;
        this.message = message;
        this.time = time;
        this.habits = habits;
    }
    public void setremainder(){
        System.out.println("Remainder message: " + message);
        System.out.println("Remainder time: " + time);
        System.out.println("Habit to do: " + habits.getHabitName());
    }
    public void displayremainder(){
        System.out.println("Remainder ID: " + remainderid);
        System.out.println("Remainder message: " + message);
        System.out.println("Remainder time: " + time);
        System.out.println("Habit to do: " + habits.getHabitName());
    }
}
