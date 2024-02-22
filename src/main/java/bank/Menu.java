package bank;

import java.util.Scanner;

import javax.security.auth.login.LoginException;
import javax.sql.DataSource;

import bank.exceptions.AmountExceptions;

public class Menu {
  private Scanner scanner;

  /**
   * @param args
   */
  public static void main(String[] args ){
    System.out.println("Welcome to Globe Bank International");

    Menu menu = new Menu();
    menu.scanner = new Scanner(System.in);
    Customer customer = menu.authenticateUser();

    if(customer != null){
      final Account account = DataSource.getAccount(customer.getAccountId());
      menu.showMenu(customer, account);

    }

    

    menu.scanner.close();


  }

  

  cateUser(){
    System.out.println("enter username");
    String username = scanner.next();

    System.out.println("enter password");
    String password = scanner.next();

    Customer customer = null;
    try{
    customer = Authenticator.loginogin(username, password) throw LoginException;
    } catch(LoginException e){
      System.out.println("Error" + e.getMessage());

    }
    return customer;



  }
  /**
   * @param customer
   * @param account
   */
  unt){
    
    int selection = 0;

    while ( selection !=4 && customer.isAuthenticated()){
      System.out.println("============================================");
      System.out.println("Please select one of the following options: ");
      System.out.println("1: Deposit");
      System.out.println("2: Withdraw");
      System.out.println("3: Check Balance");
      System.out.println("4: Exit");
      System.out.println("============================================");

      selection = scanner.nextInt();
      double amount = 0;

      switch(selection){
        case 1:
        System.out.println("How much would you like to deposit?");
        amount = scanner.nextDouble();
        try {
          account.deposit(amount);
        }catch(AmountExceptions e){
          System.out.println(e.getMessage());
          System.out.println("Please try again.");
        }
        break;
        
        case 2:
        System.out.println("How much would you like to withdraw?");
        amount = scanner.nextDouble();
        try{
          account.withdraw(amount);
        }catch(AmountExceptions e){
          System.out.println(e.getMessage());
          System.out.println("Please try again");
        }
        break;
        
        case 3:
        System.out.println("Current Balance: " + account.getBalance());
        break;

        case 4:
        Authenticator.logout(customer);
        System.out.println("Thanks for Banking at Globe International!");
        break;

        default:
        System.out.println("Invalid option. Please retry");
        break;
      }
    }
  }
}
