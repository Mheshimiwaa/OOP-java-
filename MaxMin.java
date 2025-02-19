import javax.swing.*;

 class maxmin {
    public static void main(String[] args) {
        // Get the size of the array from the user
        int size=10;
        int[] array = new int[size];
        
        // Get the array elements from the user
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i + 1) + ":"));
        }

        int maxVal = findMax(array);
        int minVal = findMin(array);
        
        // Display the results
        JOptionPane.showMessageDialog(null, "Maximum value: " + maxVal);
        JOptionPane.showMessageDialog(null, "Minimum value: " + minVal);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
