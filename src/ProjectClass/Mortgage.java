package ProjectClass;

import java.io.Serializable;

public class Mortgage extends Liabilities implements Serializable {

    String name;
    String date;
    String Category;

    public Mortgage(String n, String a, String ir, String tp, String dt) {
        name = n;
        interestAmount = amount + (amount * interestRate);
        amount = Float.parseFloat(a);
        interestRate = Float.parseFloat(ir);
        timePeriod = Integer.parseInt(tp);
        date = dt;
        Category = "Mortgage";

    }

    public void setDetails() {

    }

    public void getDetails() {

    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public float getAmount() {
        return amount;
    }

    @Override
    public float getInterestRate() {
        return interestRate;
    }

    @Override
    public int getTimePeriod() {
        return timePeriod;
    }

    @Override
    float callMonthlyDebt() {
        return (interestAmount / (timePeriod * 12));
    }

    @Override
    float callYearlyDebt() {
        return (interestAmount / 12);
    }

    @Override
    float debtRemaining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    float getInterestAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
