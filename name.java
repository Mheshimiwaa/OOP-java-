import javax.swing.*;
class name{
    public static void main(String args []){
        int n;
        String name;
         name=JOptionPane.showInputDialog("Enter your name:");
         n=Integer.parseInt(JOptionPane.showInputDialog("enter number to repeat:"));
        for(int i=0;i<n;i++){
            System.out.println(name);
        }
    }
}