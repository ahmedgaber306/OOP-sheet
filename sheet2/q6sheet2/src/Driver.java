public class Driver {
    private int driverId;
    private String name;
    private String licenseNumber;


    public Driver(int driverId, String licenseNumber, String name) {
        this.driverId = driverId;
        this.licenseNumber = licenseNumber;
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
}
