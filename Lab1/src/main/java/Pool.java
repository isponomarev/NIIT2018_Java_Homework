public class Pool {
    private final double concretePrice = 1000.0;
    private final double wallPrice = 2000.0;
    private final double poolRadius = 3.0;
    private final double trackWidth = 1.0;
    private double fullTrackPrice;
    private double fullWallPrice;

    private void calculate(){
        Circle pool = new Circle();
        Circle poolWithTrack = new Circle();
        pool.setRadius(poolRadius);
        poolWithTrack.setRadius(poolRadius+trackWidth);
        double trackArea = poolWithTrack.getArea() - pool.getArea();
        fullTrackPrice = trackArea * concretePrice;
        double wallLength = poolWithTrack.getFerence();
        fullWallPrice = wallLength * wallPrice + fullTrackPrice;
    }

    public double getFullTrackPrice() {
        return fullTrackPrice;
    }

    public double getFullWallPrice() {
        return fullWallPrice;
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.calculate();
        System.out.println("The price of concrete track around pool: " + pool.getFullTrackPrice());
        System.out.println("The price of wall with track around pool: " + pool.getFullWallPrice());
    }


}
