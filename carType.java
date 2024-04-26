public class carType {
    private String brand;

    private String model;
    private String fuelType;
    private String registrationNumber;
    private int registrationYear;
    private int registrationMonth;
    private double odometer;

    public carType(String brand, String model, String fuelType, String registrationNumber, int registrationYear, int registrationMonth, double odometer) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.registrationYear = registrationYear;
        this.registrationMonth = registrationMonth;
        this.odometer = odometer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public int getRegistrationMonth() {
        return registrationMonth;
    }

    public void setRegistrationMonth(int registrationMonth) {
        this.registrationMonth = registrationMonth;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

}