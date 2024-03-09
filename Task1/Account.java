public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    Account(double balance){

        this.balance=balance;

    }

    void withDraw(double amount) {
        if (balance > amount) {

            balance -= amount;
            System.out.println("Your new balance is: "+balance);
        }
        else {
            System.out.println("Cannot withdraw this amount");
        }
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Your new balance is : "+balance);
    }

    void checkBalance(){
        System.out.println("Your balance is: "+getBalance());
    }
}
