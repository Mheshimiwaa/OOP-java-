// MainProg.java
import javax.swing.JOptionPane;

public class MainProg {
    public static void main(String args[]) {
        // List of shapes
        System.out.println("1. Sphere");
        System.out.println("2. Cone");
        System.out.println("3. Cylinder");

        // Get user choice
        String ch = JOptionPane.showInputDialog("Enter your Choice");
        int choice = Integer.parseInt(ch);

        if (choice == 1) { // If choice is Sphere
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);
            Sphere sp = new Sphere(r);
            System.out.println("The Volume of the Sphere is " + sp.volume());
        } else if (choice == 2) { // If choice is Cone
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);
            String H = JOptionPane.showInputDialog("Enter the Height");
            int h = Integer.parseInt(H);
            Cone cn = new Cone(r, h);
            System.out.println("The Volume of the Cone is " + cn.volume());
        } else if (choice == 3) { // If choice is Cylinder
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);
            String H = JOptionPane.showInputDialog("Enter the Height");
            int h = Integer.parseInt(H);
            Cylinder cyl = new Cylinder(r, h);
            System.out.println("The Volume of the Cylinder is " + cyl.volume());
        } else {
            System.out.println("ERROR IN INPUT");
        }
    }
}
