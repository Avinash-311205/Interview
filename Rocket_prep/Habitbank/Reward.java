package rocket_practice.Habitbank;

public class Reward {
    private int points;
    private int rewardId;
    private String BadgeName;
    private Habit habits;

    public Reward(int points, int rewardId, String BadgeName, Habit habits){
        this.points = points;
        this.rewardId = rewardId;
        this.BadgeName = BadgeName;
        this.habits = habits;
    }

    public void keepreward(){
        System.out.println("YOu have earned " + points + " points for completing the habit: " + habits.getHabitName());
        System.out.println("You have also earned a badge: " + BadgeName);
    }
    public void viewreward(){
        System.out.println("Reward ID: " + rewardId);
        System.out.println("Points: " + points);
        System.out.println("Badge Name: " + BadgeName);
        System.out.println("Habit: " + habits.getHabitName());
    }

    @Override
    public String toString(){
        return "Reward{" +
                "points= " + points +
                ", rewardid= " + rewardId +
                ", BadgeName= " + BadgeName +
                ", habit= " +habits.getHabitName() + 
                "}";
            }
    }

