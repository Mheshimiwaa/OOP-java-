import javax.swing.*;

public class divisiblenumbers {
    public static void main(String[] args) {
        
        int arraySize = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of integers:"));


        int[] numbers = new int[arraySize];

        
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + ":"));
        }

        int evenCount = 0;
        int oddCount = 0;

        
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the results
        JOptionPane.showMessageDialog(null, "Even numbers: " + evenCount + "\nOdd numbers: " + oddCount);
    }
}
