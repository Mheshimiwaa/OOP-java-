import javax.swing.*;
class power {
    public static void main(String args[]){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("enter base number:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("enter power number:"));
        int result=1;
        for(int i=1;i<=num2;i++){
            result*=num1;
        } 
        System.out.println("num1 raised to power"+num2+"is:"+result);



    }
}
