
import ProjectClass.Liabilities;
import ProjectClass.Mortgage;
import java.io.Serializable;
import java.util.ArrayList;


public class UserLogin implements Serializable {
    String userName,password;
    
    
    
    public void setUser(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public String getUserName(){
        return userName; 
    }
    public String getPassword(){
        return password; 
    }
   
    
}
