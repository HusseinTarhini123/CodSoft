import java.util.ArrayList;

public class Bank {
   private int accountNumber;
    private double balance;
     private float interestRate= 0.05f;
     private ArrayList<Double> transaction=new ArrayList<Double>();

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Double> transaction) {
        this.transaction = transaction;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

     Bank(int accNum,double b){
        accountNumber=accNum;
        balance=b;
    }

     void deposit(double b){
        balance+=b;
        System.out.println(balance);
        transaction.add(b);
     }
     void withDraw(double b){
        balance-=b;
        transaction.add(-b);
     }
     boolean overDrawn(){
         if(balance<0)
             return true;
         else
             return false;
     }
     void addInterest(){
        balance+=balance*interestRate;
     }
     String statementOfAccount(){
        if(overDrawn())
            return("Your balance is"+balance+" OverDrawn");
        else
            return("Your balance is"+balance);
     }

     void Transactions(){
        if(transaction.size()<5){
            for(int i=0;i<transaction.size();i++)
                System.out.println(transaction.get(i));
        } else
            for(int i=transaction.size()-5;i<transaction.size();i++)
                System.out.println(transaction.get(i));
     }
}
