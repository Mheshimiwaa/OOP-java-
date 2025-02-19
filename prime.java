import javax.swing.JOptionPane;

class prime {
    public static void main(String[] args) {
        // Input number
        String numberInput = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(numberInput);

        // Check if the number is prime
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Show result
        if (isPrime) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is a prime number.");
        } else {
            JOptionPane.showMessageDialog(null, "The number " + number + " is not a prime number.");
        }
    }
}
