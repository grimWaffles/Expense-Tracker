
package ProjectClass;

import java.io.Serializable;


public abstract class Liabilities implements Serializable {

    float interestAmount;
    static float totaldebt;
    float amount;
    float interestRate;
    int timePeriod;

    abstract public float getAmount();

    abstract public float getInterestRate();

    abstract public int getTimePeriod();

    abstract float callMonthlyDebt();

    abstract float callYearlyDebt();

    abstract float debtRemaining();

    abstract float getInterestAmount();

    abstract String getDate();

}
