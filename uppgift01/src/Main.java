public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("ABC123", "Volvo", "XC50");
        Car car2 = new Car("EFG456", "Citroen", "C4");


        CarOwner owner1 = new CarOwner("Peter", "Stengatan", 44);
        CarOwner owner2 = new CarOwner("Mathilde", "Gatan 4", 28);
        CarOwner owner3 = new CarOwner("Karro", "Stigen 12", 39);

        car1.setOwner(owner3);
        car2.setOwner(owner2);

        System.out.println(car1.getOwner());
        System.out.println(car2.getOwner());

        car1.setOwner(owner1);
        car2.setOwner(owner3);

        System.out.println(car1.getOwner());
        System.out.println(car2.getOwner());

        System.out.println(car1);
        System.out.println(car2);
    }
}
