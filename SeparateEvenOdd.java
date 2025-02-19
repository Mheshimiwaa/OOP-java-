import javax.swing.JOptionPane;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
        int[] numbersArray = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbersArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (i + 1) + ":"));
        }

        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();
        
        for (int i = 0; i < size; i++) {
            if (numbersArray[i] % 2 == 0) {
                evenNumbers.append(numbersArray[i]).append(" ");
            } else {
                oddNumbers.append(numbersArray[i]).append(" ");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Even numbers: " + evenNumbers.toString());
        JOptionPane.showMessageDialog(null, "Odd numbers: " + oddNumbers.toString());
    }
}
