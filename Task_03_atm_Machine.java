import java.util.Scanner;
 class ATM{
     int balance=0;
     int pin=123; 

     public void checkpin(){
        System.out.println("\n *** ATM INTERFACE MADE BY SHUBHRANSHU SHEKHAR DAS *** ");
         System.out.print("\nEnter your pin: ");
         Scanner sc = new Scanner(System.in);
         int enteredpin = sc.nextInt();

         if (enteredpin==pin){
             menu();
         } else {
             System.out.println("INVALID PIN !! ENTER IT AGAIN !!");
             checkpin();
         }
     }
     public void menu(){
         System.out.println("\n1. Check balance");
         System.out.println("2. Deposit money");
         System.out.println("3. Withdraw money");
         System.out.println("4. Exit");
         System.out.print("\nSelect option (1,2,3,4) : ");

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
                 System.out.println("\n*** THANKS FOR USING ATM !! ***");
                 break;
             default:
                 System.out.println("Invalid option");
         }
     }
     public void checkBalance(){
         System.out.println("Your Balance is : " + balance);
         menu();
     }
     public void depositBalance(){
         System.out.print("\nEnter amount you wanna deposit: ");
         Scanner sc = new Scanner(System.in);
         int amount = sc.nextInt();
         balance+=amount;
         System.out.println("Amount deposited: " + amount);
         System.out.println("Current balance : " + balance);
         menu();
     }

     public void withdrawBalance(){
         System.out.print("\n Enter amount to withdraw: ");
         Scanner sc = new Scanner(System.in);
         int amount = sc.nextInt();

         if (amount>balance){
             System.out.println("INSUFFICIENT FUNDS !!");
             menu();
         }else{
             balance-=amount;
             System.out.println("Sucessfully withdrawn: " + amount);
             System.out.println("Current balance : "+ balance);
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
