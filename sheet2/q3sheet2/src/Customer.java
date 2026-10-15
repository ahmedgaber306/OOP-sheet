public class Customer {
    /*
    Customer:
    Attributes: customerId (int), name (String), phoneNumber (String), nightsReserved (int).
    Methods: displayCustomerDetails() (prints customer info) or calculateBill(double pricePerNight).

     */
    private int customerId;
    private String name;
    private String phoneNumber;
    private int nightsReserved;
    private Room room;

    public Customer(int customerId, String name, String phoneNumber, int nightsReserved, Room room) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nightsReserved = nightsReserved;
        this.room = room;

    }
    public int getcustomerId() {
        return customerId;

    }
    public void setcustomerId(int customerId) {
        this.customerId = customerId;

    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;

    }
    public String getPhoneNumber() {
        return phoneNumber;

    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }
    public int getNightsReserved() {
        return nightsReserved;

    }
    public void setNightsReserved(int nightsReserved) {
        this.nightsReserved = nightsReserved;

    }
    public Room getRoom() {
        return room;

    }
    public void setRoom(Room room) {
        this.room = room;

    }
    @Override
    public String toString() {
        return "Customer information [roomId=" + customerId + ", name=" + name + ", phoneNumber=" + phoneNumber+ ", nightsReserved=" + nightsReserved + ", room=" + room + "]";

    }

}
