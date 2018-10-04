public class Driver {
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(12345, 111.1, "help");

    //prints BankAccount information
    System.out.println("The accountID is: " + b1.getAccountID());
    System.out.println("The account balance is: " + b1.getBalance());
    System.out.println("The current password is: " + b1.getPassword());

    //changes password
    b1.setPassword("Coding");

    //prints Account & Password
    System.out.println("The new password is: " + b1.getPassword());
    System.out.println("Account & Password: " + b1);

    //tests if depositing $10 is successful
    System.out.println("$10 deposit is successful? " + b1.deposit(10));
    System.out.println("New balance is: " + b1.getBalance());

    //tests if depositing -$100 is successful
    System.out.println("$-100 deposit is successful? " + b1.deposit(-100));
    System.out.println("New balance is: " + b1.getBalance());

    //tests if withdrawing $1 is successful
    System.out.println("$1 withdraw is successful? " + b1.withdraw(1));
    System.out.println("New balance is: " + b1.getBalance());

    //tests if withdrawing $10,000 is successful - different way of printing out
    System.out.println("$10000 withdraw is successful? ");
    if (b1.withdraw(10000)) {
      System.out.println("Success!");
    } else {
      System.out.println("Failed.");
    }
  }
}
