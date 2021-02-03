public class Main {
    public static void main(String[] args) {

        Train train1 = new Train(160, 2000, 3);
        Car car1 = new Car(50, 500, 200);
        Boat boat1 = new Boat(70, 20000, 7000);
        Bike bike1 = new Bike(10, 5, 7);


        train1.printMe();
        car1.printMe();
        boat1.printMe();
        bike1.printMe();


    }
}
