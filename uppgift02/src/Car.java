public class Car extends Vehicle {

    private int horsepower;

    public Car(int velocity, int weight, int horsepower) {
        super(velocity, weight);
        this.horsepower = horsepower;
    }

    public void shit(){
        changeVelocity(20);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void printMe() {
        System.out.println("Car with velocity: " + getVelocity()+ "km/h, weight: " + getWeight() +"kg and amount of horsepower: "+ getHorsepower());
    }

}
