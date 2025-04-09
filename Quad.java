import javax.swing.*;

class Quad {
    int a, b, c;

    Quad(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double computeQuad1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    double computeQuad2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter value of a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter value of b:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter value of c:"));

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Coefficient 'a' cannot be 0!");
        } else if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "Discriminant is less than 0!");
        } else {
            Quad myQuad = new Quad(a, b, c);
            JOptionPane.showMessageDialog(null, "Root x1 = " + myQuad.computeQuad1());
            JOptionPane.showMessageDialog(null, "Root x2 = " + myQuad.computeQuad2());
        }
    }
}