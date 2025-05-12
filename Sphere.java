// Sphere.java
public class Sphere extends Shape {
    
    // Constructor
    public Sphere(int radius) {
        super(radius);
    }

    // Method to calculate volume
    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
