package rocket_practice.Piggybank;
public class ExpenseTracker {
    private int expenseID;
    private String category;
    private int save;

    public ExpenseTracker(int expenseID, String category, int save){
        this.expenseID = expenseID;
        this.category = category;
        this.save = save;
    }

    public void viewExpense(){
        System.out.println("Expense ID: " + expenseID);
        System.out.println("Category: " + category);
        System.out.println("Save: " + save);
    }
    public void addExpense(int amount){
        save += amount;
        System.out.println("Expense added. Current save: " + save);
    }
}
