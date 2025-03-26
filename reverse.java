 import javax.swing.*;
 class reverse {
    public static void main(String args[]){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Enter numbers to reverse:"));
        int reversed=0;
        while(num !=0){
            int digit =num%10;
            reversed = reversed*10+digit;
            num/=10;
        }
        JOptionPane.showMessageDialog(null,"reversed:"+reversed);

    }            
}
