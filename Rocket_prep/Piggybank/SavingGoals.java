package rocket_practice.Piggybank;


public class SavingGoals {
    private int GoalId;
    private String reason;
    private float targetamnt;
    private int deadline;

    public SavingGoals(int GoalId, String reason, float targetamnt, int deadline){
        this.GoalId = GoalId;
        this.reason = reason;
        this.targetamnt = targetamnt;
        this.deadline = deadline;
    }
    public void setgoal(){
        System.out.println("Goal set with id: " + GoalId);
        System.out.println("Goal set with reason: " + reason);
        System.out.println("Goal set with target amount: " + targetamnt);
        System.out.println("Goal set with deadline: " + deadline);
    }
    public void seeprogress(){
        System.out.println("Seeing Progress: " +targetamnt);
    }

}
