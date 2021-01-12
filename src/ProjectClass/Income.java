
package ProjectClass;

import java.io.Serializable;


public class Income implements Taxable, Serializable{
    String incomeCategories;
   
    static float totalIncome;
    
    String detailsOfIncome;
    float amountOfIncome;
    Boolean taxable;
    Boolean typeOfIncome;
    String date;
    float tax;

    public Income(String incomeCategories,float amountOfIncome,String date,String detailsOfIncome){
        this.incomeCategories=incomeCategories;
        this.amountOfIncome=amountOfIncome;
        this.date=date;
        this.detailsOfIncome=detailsOfIncome;
    }
    
    public String getIncomeCat(){
        return incomeCategories;
    }
    public float getAmount(){
        return amountOfIncome;
    }
    public String getDate(){
        return date;
    }
    public String getIncomeDet(){
        return detailsOfIncome;
    }
   
    @Override
    public float calTax(float y){
        if(y<100000){
            tax=y*0.00f;   
        }
        else if(y>100000 || y<300000){
            tax=y*0.15f;
            
        }
        else if(y>300000){
            tax=y*0.25f;
            
        }
        return tax
                ;
    }
    
}
