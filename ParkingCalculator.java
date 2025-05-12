import javax.swing.JOptionPane;
import java.time.Duration;
import java.time.LocalDateTime;

 class ParkingCalculator {

    public static void main(String[] args) {
        // Record the start time
        LocalDateTime startTime = LocalDateTime.now();

        // Show a dialog box to indicate the timer has started
        JOptionPane.showMessageDialog(null, "Parking timer started. Click OK when leaving.",
                "Parking System", JOptionPane.INFORMATION_MESSAGE);

        // Record the end time
        LocalDateTime endTime = LocalDateTime.now();

        // Calculate parking duration in hours
        Duration duration = Duration.between(startTime, endTime);
        double hoursParked = duration.toMillis() / (1000.0 * 60 * 60);

        // Initialize total cost
        double totalCost = 0.0;

        // Check if it's a weekday or weekend
        int dayOfWeek = startTime.getDayOfWeek().getValue();
        int hour = startTime.getHour();

        // Simplified rate calculation
        if (dayOfWeek >= 1 && dayOfWeek <= 5) { // Weekdays
            if (hour >= 8 && hour < 17) { // Business hours
                totalCost = hoursParked * 20;
            } else { // Non-business hours
                totalCost = hoursParked * 10;
            }
        } else { // Weekends
            totalCost = hoursParked * 15;
        }

        // Display the result
        String message = String.format("""
                Parking Duration: %.2f hours
                Total Cost: %.2f shillings
                """, hoursParked, totalCost);

        JOptionPane.showMessageDialog(null, message, "Parking Invoice", JOptionPane.INFORMATION_MESSAGE);
    }
}
