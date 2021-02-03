public class Train extends Vehicle {

    private int wagons;

    public Train(int velocity, int weight, int wagons) {
        super(velocity, weight);
        this.wagons = wagons;
    }

    public void connectWagon(){
        wagons++;
    }

    public int getWagons() {
        return wagons;
    }

    public void printMe() {
        System.out.println("Train with velocity: " + getVelocity()+ "km/h, weight: " + getWeight() +"kg and number of wagons: "+ getWagons());
    }

}
