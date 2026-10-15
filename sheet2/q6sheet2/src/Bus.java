public class Bus {
    private String busNumber;
    private String rout;
    private int capacity ;
    private Driver driver;

    public Bus(String busNumber, String rout, int capacity, Driver driver) {
        this.busNumber = busNumber;
        this.rout = rout;
        this.capacity = capacity;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public void displayBusInfo(){
        System.out.println("=======Driver information========");
        System.out.println("Driver ID: " + driver.getDriverId());
        System.out.println("Name: " + driver.getName());
        System.out.println("licenseNumber: " + driver.getLicenseNumber());
        System.out.println("=======Bus information========");
        System.out.println("BusNumber"+getBusNumber());
        System.out.println("Bus rout"+getRout());
        System.out.println("Bus capacity"+getCapacity());


    }

}
