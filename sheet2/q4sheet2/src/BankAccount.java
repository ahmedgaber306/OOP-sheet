public class BankAccount {
    private static int nextAccountNumber =1001;
    private int accountNumber;
    private double balance;
    public BankAccount() {
        this.accountNumber = nextAccountNumber;
        nextAccountNumber ++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        System.out.println("please make sure you want to change the account number !!!");

    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;

    }
    public void deposit(double amount){
        if (amount >= 0 ){
            this.balance += amount;
            displayBalance();
        }else System.out.println( "Sorry you can not deposit 0 or negative !!!");

    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Sorry your balance is not enough ");
            displayBalance();

        }else {
            this.balance -= amount;
            displayBalance();
        }
    }
    public void displayBalance(){
        System.out.println("Your balance is: "+this.balance);

    }
    @Override
    public String toString (){
        return "Bank Account information: {"+"account number: "+ accountNumber +" balance: " +balance +"}";
    }




}
