
package ProjectClass;

import java.io.Serializable;


public abstract class Budget implements Serializable {
    String name; float amount;
    String date;
    
    
    abstract public String getName();
    abstract public float getAmount();
    abstract public String getDate();
    public String getMonth(){
        String []token;
        token=date.split("/");
        return token[1];
    }
    public String getYear(){
        String []token;
        token=date.split("/");
        return token[2];
    }
    
    public void getBudget(){
        
    }
    public void setBudget(){
        
    }
    
}
