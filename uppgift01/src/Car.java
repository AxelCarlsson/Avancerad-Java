public class Car {
    private String regNo;
    private String model;
    private String brand;
    private CarOwner owner;

    public Car(String regNo, String model, String brand) {
        this.regNo = regNo;
        this.model = model;
        this.brand = brand;
        this.owner = null;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Current car: " + brand + " " + model + " " + regNo + ", " + owner;
    }
}
