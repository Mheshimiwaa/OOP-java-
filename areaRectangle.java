import javax.swing.*;
class areaRectangle{
    static int length,width;
    static double ComputeArea(){
    return length*width;
}
static double ComputePerimeter(){
    return (length+width)*2;
}
public static void main(String args[]){
    length=Integer.parseInt(JOptionPane.showInputDialog("enter length:"));
    width=Integer.parseInt(JOptionPane.showInputDialog("enter width:"));
    JOptionPane.showMessageDialog(null, "the area is"+ ComputeArea());
    JOptionPane.showMessageDialog(null, "the perimeter is"+ ComputePerimeter());

}

}