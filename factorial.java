import javax.swing.*;
class factorial{
    public static void main(String args[]){
    int num=Integer.parseInt(JOptionPane.showInputDialog("enter number for factorial:"));
    int factorial=1;

    for(int i=1;i<=num;i++){
        factorial *=i;
    }
    System.out.println("Factorial of"+num+"is:"+factorial);
 }
}