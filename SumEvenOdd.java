import javax.swing.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

         int count = Integer.parseInt (JOptionPane.showInputDialog(null, "How many integers will you enter?"));
       

        for (int i = 1; i <= count; i++) {

            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer " + i + ":"));

            
            if (number % 2 == 0) {
                evenSum += number; 
            } else {
                oddSum += number; 
            }
        }

        
        JOptionPane.showMessageDialog(null, "Sum of even integers: " + evenSum + "\nSum of odd integers: " + oddSum);
    }
}
