public class Driver {
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(12345, 111.1, "help");

    System.out.println("The accountID is: " + b1.getAccountID());
    System.out.println("The account balance is: " + b1.getBalance());
    System.out.println("The current password is: " + b1.getPassword());

    b1.setPassword("Coding");

    System.out.println("The new password is: " + b1.getPassword());
    System.out.println("Account & Password: " + b1);

    System.out.println("$10 deposit is successful? " + b1.deposit(10));
    System.out.println("New balance is: " + b1.getBalance());

    System.out.println("$-100 deposit is successful? " + b1.deposit(-100));
    System.out.println("New balance is: " + b1.getBalance());

    System.out.println("$1 withdraw is successful? " + b1.withdraw(1));
    System.out.println("New balance is: " + b1.getBalance());


    System.out.println("$10000 withdraw is successful? ");
    if (b1.withdraw(10000)) {
      System.out.println("Success!");
    } else {
      System.out.println("Failed.");
    }
  }
}
