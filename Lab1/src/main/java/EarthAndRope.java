public class EarthAndRope {
    public final double earthRadius = 6378.1;
    private double rope = 1.0;
    private double height;

    public double searchHeight(){
        Circle earth = new Circle();
        Circle earthNew = new Circle();
        earth.setRadius(earthRadius);
        double ferenceEarth = earth.getFerence();
        double ferenceNew = ferenceEarth + rope;
        earthNew.setFerence(ferenceNew);
        double radiusNew = earthNew.getRadius();
        height = radiusNew - earthRadius;
        return height;
    }

    public static void main(String[] args) {
        EarthAndRope rope = new EarthAndRope();
        System.out.println("The height of the rope above the ground: " + rope.searchHeight());
    }
}
