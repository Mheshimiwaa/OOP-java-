import javax.swing.*;
import java.time.LocalTime;

class phoneBilling {
    public static void main(String[] args) {
        
        LocalTime starttime = LocalTime.now();
        JOptionPane.showMessageDialog(null, "Call started at: " + starttime);

        
        JOptionPane.showMessageDialog(null, "Press OK when the call ends");

        
        LocalTime endtime = LocalTime.now();
        JOptionPane.showMessageDialog(null, "Call started at: " + endtime);


        
        boolean isDifferentNetwork = JOptionPane.showConfirmDialog(null, "Is the call between different networks?") == JOptionPane.YES_OPTION;

        
        int startMinutes = starttime.getHour() * 60 + starttime.getMinute();
        int endMinutes = endtime.getHour() *60+ endtime.getMinute();
        int duration = endMinutes - startMinutes;
        if (duration < 0) duration += 24 * 60; 

        double chargepermin;
        int startHour = starttime.getHour();
        if ((startHour >= 18 && startHour <= 24) || (startHour >= 0 && startHour < 6)) {
            chargepermin = 4.0;
        } else {
            chargepermin = 3.0;
        }

        double totalcharge = duration * chargepermin;

        
        if (duration > 2) {
            totalcharge += 0.16 * totalcharge; 
        }

        
        if (isDifferentNetwork) {
            totalcharge += 5.0;  
        }

        JOptionPane.showMessageDialog(null, "Duration of call: " + duration + " minutes\nTotal charge: " + totalcharge + " units");
    }
}
