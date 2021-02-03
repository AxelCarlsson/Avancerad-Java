public class Main {
    public static void main(String[] args) {
        Train train1 = new Train(160, 2000);

        train1.connectWagon();
        train1.connectWagon();

        train1.changeVelocity(-70);

        System.out.println(train1.getWagons());
        System.out.println(train1.getVelocity());
    }
}
