package ProjectClass;

import java.util.Date;

public class Expense {

    String detailsOfExpense;
    float amountOfTheExpense;

    float totalExpense;
    String date;

    public Expense(String dte, String n, String a) {
        detailsOfExpense = n;
        amountOfTheExpense = Float.parseFloat(a);
        date = dte;
        totalExpense += amountOfTheExpense;
    }

    public String getDate() {
        return date;
    }

    public String getDetails() {
        return detailsOfExpense;
    }

    public float getAmount() {
        return amountOfTheExpense;
    }
}
