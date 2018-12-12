import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Circle {
    private double radius;
    private double ference;
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * PI * radius;
        this.area = PI * radius * radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / (2 * PI);
        this.area = PI * this.radius * this.radius;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = sqrt(area / PI);
        this.ference = 2 * PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getFerence() {
        return ference;
    }

    public double getArea() {
        return area;
    }
}
