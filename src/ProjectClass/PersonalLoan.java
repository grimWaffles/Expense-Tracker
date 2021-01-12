/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectClass;

import java.io.Serializable;

/**
 *
 * @author Rakib
 */
public class PersonalLoan extends Loan implements Serializable {

    String date;

    public PersonalLoan(String n, String d, String a, String ir, String tp, String dte, String cat) {
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
        return (interestAmount / (timePeriod));//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    float debtRemaining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return Name;//To change body of generated methods, choose Tools | Templates.
    }

}
