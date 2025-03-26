import javax.swing.JOptionPane;

class bigsmall {
    public static void main(String[] args) {
        int largest = 0, smallest = 0;
        int temp;
        int count = 0;
        int choice;

        do {
            String input = JOptionPane.showInputDialog("Enter a number:");
            int number = Integer.parseInt(input);

            if (count == 0) {
                largest = smallest = number;
            } else {
                if (number > largest) {
                    temp = largest;
                    largest = number;
                }
                if (number < smallest) {
                    temp = smallest;
                    smallest = number;
                }
            }
            count++;
            choice = JOptionPane.showConfirmDialog(null, "Do you want to enter another number?", 
                                                   "Continue", JOptionPane.YES_NO_OPTION);

        } while (choice == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Largest number entered: " + largest +
                                            "\nSmallest number entered: " + smallest);
    }
}
