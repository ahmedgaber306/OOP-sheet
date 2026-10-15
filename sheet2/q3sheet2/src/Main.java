public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(540, "Suite", 200);
        Room r2 = new Room(530, "Deluxe", 20);
        Customer customer1 =new Customer(1234, "ahmed ashraf ", "0123456789", 7,r1);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(customer1.toString());

    }
}
