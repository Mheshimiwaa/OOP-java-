import javax.swing.JOptionPane;

 class BubbleSort {
    public static void main(String[] args) {
        
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
        

        
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (i + 1) + ":"));
        }

        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        
        StringBuilder sortedArray = new StringBuilder("Sorted array: ");
        for (int num : numbers) {
            sortedArray.append(num).append(" ");
        }
        JOptionPane.showMessageDialog(null, sortedArray.toString());
    }
}
