import java.util.*;

public class Bank {
    public static void main(String[] args){
        Account account =new Account(2500);
        Scanner scan=new Scanner(System.in);
        int choice;

        System.out.println("Welcome to our bank\n");
        do{

            System.out.println("Entre your choice: \n");
            System.out.println("1.Deposit\n"+"2.WithDraw\n"+"3.Check your balance\n"+"0.Exit\n");

            choice=scan.nextInt();

            if(choice==0)
                break;

            else if (choice==1) {
                System.out.println("Enter the amount to deposit: ");
                double amount=scan.nextDouble();
                account.deposit(amount);
            }

            else if(choice==2){
                System.out.println("Enter the amount to WithDraw: ");
                double amount=scan.nextDouble();
                account.withDraw(amount);
            }

            else if(choice==3){
                account.checkBalance();
            }

        }while (choice != 0);
    }
}
