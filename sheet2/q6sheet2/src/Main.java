public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver(1001, "l-n-12001", "Ahmed");


        Bus bus1 = new Bus("Bus-1", "rout Elnasr", 50 ,driver1);
        bus1.displayBusInfo();

    }
}
