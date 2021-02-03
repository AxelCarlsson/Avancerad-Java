public class Boat extends Vehicle{

    private int deadweight;

    public Boat(int velocity, int weight, int deadweight) {
        super(velocity, weight);
        this.deadweight = deadweight;
    }

    public void turn(){
        changeVelocity(-20);
    }

    public int getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(int deadweight) {
        this.deadweight = deadweight;
    }

    public void printMe() {
        System.out.println("Boat with velocity: " + getVelocity()+ "km/h, weight: " + getWeight() +"kg and amount of deadweight: "+ getDeadweight() + "kg");
    }
}
