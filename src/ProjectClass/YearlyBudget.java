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
public class YearlyBudget extends Budget implements Serializable {
    static float totalYearlyBudget=0.00f;

    public YearlyBudget(String name,float amount,String date) {
        this.name=name;
        this.amount=amount;
        this.date=date;
    }
    
    
    public void callYearlyBudget(){
        
    }
    public void editYearlyBudget(){
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getAmount() {
        return amount;
    }

    @Override
    public String getDate() {
        return date;
    }
}
