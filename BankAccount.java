public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accID, double bal, String pass) {
    balance = bal;
    accountID = accID;
    password = pass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  //extra get password method
  public String getPassword() {
    return password;
  }

  public void setPassword(String newpass) {
    password = newpass;
  }

  public String toString() {
    return accountID + "\t" + password;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

}
