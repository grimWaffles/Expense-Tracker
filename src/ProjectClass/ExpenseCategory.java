package ProjectClass;

import java.util.ArrayList;

public class ExpenseCategory {

    String Category;
    ArrayList<Expense> subExpenseList;
    
    public String getCategory() {
        return Category;
    }

    public ArrayList<Expense> getSubExpense() {
        return subExpenseList;
    }

    public void setCategory(String c) {
        Category = c;
    }

}
