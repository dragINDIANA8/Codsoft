import java.util.Scanner;
 class ATM{
     int balance=0;
     int pin=123;

     public void checkpin(){
         System.out.print("Enter your pin: ");
         Scanner sc = new Scanner(System.in);
         int enteredpin = sc.nextInt();

         if (enteredpin==pin){
             menu();
         } else {
             System.out.println("Invalid pin, enter it again");
             checkpin();
         }
     }
     public void menu(){
         System.out.println("1. Check balance");
         System.out.println("2. Deposit money");
         System.out.println("3. Withdraw money");
         System.out.println("4. Exit");

         Scanner sc = new Scanner(System.in);
         int op = sc.nextInt();

         switch (op){
             case 1:
                  checkBalance();
                  break;
             case 2:
                 depositBalance();
                 break;
            case 3:
                 withdrawBalance();
                 break;
             case 4:
                 System.out.println("Thanks for using ATM");
                 break;
             default:
                 System.out.println("invalid option");
         }
     }
     public void checkBalance(){
         System.out.println("Your Balance is : " + balance);
         menu();
     }
     public void depositBalance(){
         System.out.println("enter amount you wanna deposit: ");
         Scanner sc = new Scanner(System.in);
         int amount = sc.nextInt();
         balance+=amount;
         System.out.println("amount deposited: " + amount);
         System.out.println("current balance : " + balance);
         menu();
     }

     public void withdrawBalance(){
         System.out.println("select amount to withdraw: ");
         Scanner sc = new Scanner(System.in);
         int amount = sc.nextInt();

         if (amount>balance){
             System.out.println("Insufficient funds");
         }else{
             balance-=amount;
             System.out.println("sucessfully withdraw: " + amount);
             System.out.println("current balance : "+ balance);
             menu();
         }
     }




 }
public class Task_03_atm_Machine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();

    }
}
