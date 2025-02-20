import javax.swing.*;

class PhoneBilling {
    public static void main(String[] args) {
        int starttime = Integer.parseInt(JOptionPane.showInputDialog("Enter time in 24 hrs the call started:"));
        int endtime = Integer.parseInt(JOptionPane.showInputDialog("Enter time in 24 hrs the call ended:"));
        boolean isDifferentNetwork = JOptionPane.showConfirmDialog(null, "Is the call between different networks?") == JOptionPane.YES_OPTION;

        // Ensure the duration is positive even if the call spans midnight
        int duration = (endtime >= starttime) ? (endtime - starttime) : (24 - starttime + endtime);
        
        double chargepermin;
        if ((starttime >= 1800 && starttime <= 2400) || (starttime >= 0 && starttime < 600)) {
            chargepermin = 4.0;
        } else {
            chargepermin = 3.0;
        }
        
        double totalcharge = duration * chargepermin;
        
        // Apply extra charge for duration longer than 2 minutes
        if (duration > 2) {
            double extraVAT = 0.16 * totalcharge;
            totalcharge += extraVAT;
        }
        
        // Apply extra charge for different network
        if (isDifferentNetwork) {
            totalcharge += 5.0;
        }
        
        JOptionPane.showMessageDialog(null, "Duration of call: " + duration + " minutes\nTotal charge: " + totalcharge + " units");
    }
}
