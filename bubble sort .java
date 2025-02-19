import javax.swing.JOptionPane;

 class BubbleSort {
    public static void main(String[] args) {
        
        String sizeInput = JOptionPane.showInputDialog("Enter the size of the array:");
        int size = Integer.parseInt(sizeInput);

        
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            String numberInput = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(numberInput);
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
