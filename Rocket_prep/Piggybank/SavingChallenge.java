package rocket_practice.Piggybank;
public class SavingChallenge {
    private int challengeID;
    private String challenge;

    public SavingChallenge(int challengeID, String challenge){
        this.challengeID = challengeID;
        this.challenge = challenge;
    }
    public void viewchallenge(){
        System.out.println("Challenge ID: " + challengeID);
        System.out.println("Challenge: " + challenge);
    }
    public void startchallenge(){
        System.out.println("Challenge Started");
    }
    public void sharemilestone(String status){
        if (status.equals("complete")){
            System.out.println("Milestone completed successfully");
        }
    }
}
