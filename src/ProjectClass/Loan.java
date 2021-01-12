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
public abstract class Loan extends Liabilities implements Serializable {

    String LoanDetails, Name, Category;

    public String getDetail() {
        return LoanDetails;
    }

    public String getCategory() {
        return Category;
    }

    public abstract String getName();

    @Override
    public abstract float callMonthlyDebt();

    @Override
    public abstract float callYearlyDebt();

    @Override
    public abstract String getDate();

}
