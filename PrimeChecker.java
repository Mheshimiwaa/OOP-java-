import javax.swing.JOptionPane;

class PrimeChecker {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer:"));

       
        if (number > 0) {
            if (isPrime(number)) {
                JOptionPane.showMessageDialog(null, number + " is a prime number.");
            } else {
                JOptionPane.showMessageDialog(null, number + " is not a prime number.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The number must be positive.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
