package rocket_practice.Habitbank;

public class Community {
    private int communityId;
    private String communityname;
    private String description;

    public Community(int communityId, String communityname, String description){
        this.communityId = communityId;
        this.communityname = communityname;
        this.description = description;
    }

    public void joincommunity(){
        System.out.println("Joined community: " + communityname);
        System.out.println("Community description: " + description);
    }

    public void viewcommunity(){
        System.out.println("community id: " + communityId);
        System.out.println("Community name: " + communityname);
        System.out.println("Community description: " + description);
    }
    @Override
    public String toString(){
        return "Community{" +
                "communityId= " + communityId +
                ", communityname= " + communityname +
                ", description= " + description +
                "}";
    }
}
