import javax.swing.*;

class displaysum {
    public static void main(String[] args) {
        int choice;

        do {
          
            String input1 = JOptionPane.showInputDialog("Enter the first number:");
            double num1 = Double.parseDouble(input1);

            
            String input2 = JOptionPane.showInputDialog("Enter the second number:");
            double num2 = Double.parseDouble(input2);

           
            double sum = num1 + num2;

            
            JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + sum);

            
            choice = JOptionPane.showConfirmDialog(null, "Do you want to perform the operation again?", 
                                                   "Repeat", JOptionPane.YES_NO_OPTION);

        } while (choice == JOptionPane.YES_OPTION);

        
    }
}
