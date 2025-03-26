import javax.swing.*;
class AreaRect{
    int length,width;
    //comstructor//;
    AreaRect(int l,int w){
        length=l;
        width=w;
    }
     int computeArea(){
        return length *width;
    }
public static void main(String[]args){
    
    int l=Integer.parseInt(JOptionPane.showInputDialog("enter length:"));
    int w=Integer.parseInt(JOptionPane.showInputDialog("enter width:"));
    AreaRect MyRectangle=new AreaRect(l,w);
    JOptionPane.showMessageDialog(null,"Area="+ MyRectangle.computeArea());
    

}
    }
