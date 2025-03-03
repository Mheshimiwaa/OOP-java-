import javax.swing.*;

class Quadratic {
    static int a, b, c;

    static double computeQuadratic() {
        if ((b * b - 4 * a * c) >= 0) {
            return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        } else {
            JOptionPane.showMessageDialog(null, "Has complex roots");
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter value of a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter value of b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter value of c:"));

        double root = computeQuadratic();
        if (!Double.isNaN(root)) {
            JOptionPane.showMessageDialog(null, "The root x1 is " + root);
        }
    }
}
