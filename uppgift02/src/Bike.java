public class Bike extends Vehicle{
    private int gears;

    public Bike(int velocity, int weight, int gears) {
        super(velocity, weight);
        this.gears = gears;
    }

    public void tread(){
        changeVelocity(20);
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void printMe() {
        System.out.println("Bike with velocity: " + getVelocity()+ "km/h, weight: " + getWeight() +"kg and number of gears: "+ getGears());
    }
}
