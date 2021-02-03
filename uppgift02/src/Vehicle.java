public class Vehicle {
    private int velocity;
    private int weight;

    public Vehicle(int velocity, int weight) {
        this.velocity = velocity;
        this.weight = weight;
    }

    public void changeVelocity(int velocityChange){
        velocity = velocityChange;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getWeight() {
        return weight;
    }

}
