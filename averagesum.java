import javax.swing.*;

class averagesum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter num3:"));

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        // Display result directly in the JOptionPane.showMessageDialog method
        JOptionPane.showMessageDialog(null, "Sum is: " + sum + "\nAverage is: " + average);
    }
}
