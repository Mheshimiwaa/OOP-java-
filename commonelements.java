import javax.swing.JOptionPane;

 class Commonelements {
    public static void main(String[] args) {
        
        int arraySize1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the first array:"));

        
        int[] array1 = new int[arraySize1];
        for (int i = 0; i < arraySize1; i++) {
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + " for the first array:"));
        }

        
        int arraySize2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the second array:"));

        
        int[] array2 = new int[arraySize2];
        for (int i = 0; i < arraySize2; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter integer " + (i + 1) + " for the second array:"));
        }

        
        StringBuilder commonElements= new StringBuilder("Common elements: ");
        boolean hasCommonElements = false;

        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    if (!commonElements.toString().contains(String.valueOf(num1))) {
                        commonElements.append(num1).append(" ");
                        hasCommonElements = true;
                    }
                }
            }
        }

        if (!hasCommonElements) {
            commonElements.append("None");
        }

        
        JOptionPane.showMessageDialog(null, commonElements.toString());
    }
}
