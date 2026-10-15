public class Mainq4{
    public static void main(String[] args){
        BankAccount b1 =new BankAccount();
        Customer c1 =new Customer("Ahmed Ashraf", b1);
        c1.displayCustomerData();
        b1.deposit(20000);
        b1.withdraw(30000);
        b1.withdraw(2000);
        c1.displayCustomerData();



    }
}
