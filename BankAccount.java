public class BankAccount {
  private double balance;
  private double accountID;
  private String password;

  public BankAccount(double bal, double accID, String pass) {
    balance = bal;
    accountID = accID;
    password = pass;
  }

  public double getBalance() {
    return balance;
  }

  public double getAccountID() {
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
    return "ID " + accountID + "\t" + "Bal " + balance;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance = balance + amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (balance >= amount) {
      balance = balance - amount;
      return true;
    } else {
      return false;
    }
  }

  private boolean authenticate(String password) {
    if (this.password == password) {
      return true;
    } else {
      return false;
    }
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (amount < 0 || this.balance < amount) {
      return false;
    }
    if (this.authenticate(password)) {
        this.withdraw(amount);
        other.deposit(amount);
      } else {
      return false;
    }
   return true;
  }
}
