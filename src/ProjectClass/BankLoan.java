
package ProjectClass;

import java.io.Serializable;


public class BankLoan extends Loan  {

    String date;

    public BankLoan(String n, String d, String a, String ir, String tp, String dte, String cat) {
        date = dte;
        Category = cat;
        Name = n;
        LoanDetails = d;
        amount = Float.parseFloat(a);
        interestRate = Float.parseFloat(ir);
        timePeriod = Integer.parseInt(tp);
        interestAmount = amount + (amount * interestRate);

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
    public float callMonthlyDebt() {
        return (interestAmount / (timePeriod * 12));
    }

    @Override
    public float callYearlyDebt() {
        return (interestAmount / (timePeriod));
    }

    @Override
    float debtRemaining() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    float getInterestAmount() {
        return interestAmount;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getName() {
        return Name;
    }

}
