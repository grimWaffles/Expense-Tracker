package ProjectClass;

import ProjectClass.Asset;
import ProjectClass.Budget;
import ProjectClass.Mortgage;
import java.io.Serializable;
import java.util.ArrayList;

public class UserData implements Serializable {

    String userId, fName, lName, eMail, contact, password;
    ArrayList<Mortgage> MortgageList = new ArrayList<>();
    ArrayList<Budget> monthlyBudget = new ArrayList<>();
    ArrayList<Budget> yearlyBudget = new ArrayList<>();
    ArrayList<Asset> AssetList = new ArrayList<>();
    ArrayList<String> selectedCombo = new ArrayList<>();
    ArrayList<Income> incomeList = new ArrayList<>();
    ArrayList<Loan> LoanList = new ArrayList<>();
    ArrayList<ExpenseCategory> ExpenseList = new ArrayList<>();

    public UserData(String userId, String password, String fName, String lName, String eMail, String contact) {
        this.contact = contact;
        this.eMail = eMail;
        this.fName = fName;
        this.lName = lName;
        this.userId = userId;
        this.password = password;
    }

    public ArrayList<Income> getIncomeArrayList() {
        return incomeList;
    }

    public ArrayList<String> getSelArrayList() {
        return selectedCombo;
    }

    public ArrayList<Budget> getMonthArrayList() {
        return monthlyBudget;
    }

    public ArrayList<Budget> getYeaArrayList() {
        return yearlyBudget;
    }

    public ArrayList<Mortgage> getMortgageList() {
        return MortgageList;

    }

    public ArrayList<ExpenseCategory> getExpenseList() {
        return ExpenseList;
    }

    public ArrayList<Loan> getLoanList() {
        return LoanList;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getEmail() {
        return eMail;
    }

    public String getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList getAssetArrayList() {
        return AssetList;
    }
}
