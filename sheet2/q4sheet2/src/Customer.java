public class Customer {
    private int customerID;
    private static  int nextCustomerID = 2001;
    private String name ;
    private BankAccount account;

    public Customer(String name , BankAccount account){
        this.name=name;
        customerID = nextCustomerID;
        nextCustomerID ++ ;
        this.account = account;


    }
    @Override
    public String toString(){
        return "customer data {"+ customerID + "name: "+ name+"}";
    }
    public void displayCustomerData(){
        System.out.println( this.toString());
        System.out.println(account.toString());
    }


}
