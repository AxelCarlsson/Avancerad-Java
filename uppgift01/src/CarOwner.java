public class CarOwner extends Person {
    public CarOwner(String name, String address, int age) {
        super(name, address, age);
    }

    public String toString() {
        return "Owner is " + getName() + ", " + getAge() + " years";
    }
}