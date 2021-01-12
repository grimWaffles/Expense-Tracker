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
public class Asset implements Taxable, Serializable{
    private String name;
    private float yearlyTax;
    private float costOfAsset;
    private int  amount;
    private int returnsPerMonth;
    private int installmentsPerMonth;
    private String date;
    private String categroy;
    public Asset(){
    
    }
    public Asset(String name, int amount, int returnsPerMonth, int installmentsPerMonth) {
        
        this.name = name;
        this.amount = amount;
        this.returnsPerMonth = returnsPerMonth;
        this.installmentsPerMonth = installmentsPerMonth;
               
    }
    public Asset(String string, String string0, String string1, int a, int b, int c) {
        date = string;
        categroy = string0;
        name = string1;
        amount = a;
        returnsPerMonth = b;
        installmentsPerMonth = c;
    }
    public String getName(){
        return this.name;
    }
    public int getAmount(){
        return this.amount;
    }
    public int getReturn(){
        
        return this.returnsPerMonth;
    }
    public int getInstall(){
        return this.installmentsPerMonth;
    }
    public String getDate(){
        return date;
    }
    public String getCatagory(){
        return categroy;
    }
    public float calTax(float amount){
        return 0;
    }
    
}
