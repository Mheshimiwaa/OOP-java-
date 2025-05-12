import javax.swing.*;

public class CountNumbers {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int choice;

        do {
            
            String input = JOptionPane.showInputDialog("Enter a number:");
            int number = Integer.parseInt(input);

         
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            
            choice = JOptionPane.showConfirmDialog(null, "Do you want to enter another number?", 
                                                   "Continue", JOptionPane.YES_NO_OPTION);

        } while (choice == JOptionPane.YES_OPTION);

        
        JOptionPane.showMessageDialog(null, "Count of Positive Numbers: " + positiveCount +
                                            "\nCount of Negative Numbers: " + negativeCount +
                                            "\nCount of Zeros: " + zeroCount);
    }
}
