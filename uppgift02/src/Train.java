public class Train extends Vehicle {

    private int wagons;

    public Train(int velocity, int weight) {
        super(velocity, weight);
    }

    public void connectWagon(){
        wagons++;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }
}
