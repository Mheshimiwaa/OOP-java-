import javax.swing.*;

public class AddArrays {
    public static void main(String[] args) {
        
        int arraySize = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the arrays:"));

        int[] array1 = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + " for the first array:"));
        }

        int[] array2 = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + " for the second array:"));
        }

        int[] resultArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            resultArray[i] = array1[i] + array2[i];
        }

        StringBuilder resultArrayStr = new StringBuilder("Resulting array: ");
        for (int num : resultArray) {
            resultArrayStr.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultArrayStr.toString());
    }
}
