public class Room {

    /*
    Room:
Attributes: roomNumber (int), roomType (String, e.g., "Suite", "Deluxe"), pricePerNight (double), isAvailable (boolean).
Methods: displayRoomDetails() (prints room info) or checkAvailability().

     */

    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;

    public  Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;

    }
    public int getRoomNumber() {
        return roomNumber;

    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;

    }
    public String getRoomType() {
        return roomType;

    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;

    }
    public double getPricePerNight() {
        return pricePerNight;

    }
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;

    }
    public boolean isAvailable() {
        return isAvailable;

    }
    public void setAvailable(boolean available) {
        isAvailable = available;

    }
    @Override
    public String toString() {
        return "Room details {"+ "Room number: " +roomNumber+ " roomType: "+ roomType+ " pricePerNight: "+pricePerNight+" available: "+isAvailable+"}";

    }


}
