import javax.swing.*;

class SecondLargest {
    public static void main(String[] args) {
        
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
        int[] array = new int[size];
        
        
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i + 1) + ":"));
        }

        
        int max = array[0];
        int secondMax =array[0];
        
        
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        
        for (int i = 0; i < size; i++) {
            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        
        
        JOptionPane.showMessageDialog(null, "Second largest value: " + secondMax);
    }
}
