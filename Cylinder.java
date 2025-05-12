// Cylinder.java
public class Cylinder extends RoundBase {
    
    // Constructor
    public Cylinder(int radius, int height) {
        super(radius, height);
    }

    // Method to calculate volume
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
