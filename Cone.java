// Cone.java
public class Cone extends RoundBase {
    
    // Constructor
    public Cone(int radius, int height) {
        super(radius, height);
    }

    // Method to calculate volume
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}
