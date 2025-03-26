import javax.swing.*;
class Quad{
    int a,b,c;
    Quad (int a,int b,int c){
        this.a=a;
       this. b=b;
        this.c=c;
    }
    double computeQuad1(){
        return (-b+Math.sqrt(b*b-4*(a*c)))/(2*a);
    } double computeQuad2(){
        return (-b-Math.sqrt(b*b-4*(a*c)))/(2*a);
    }
public static void main(String args[]){
    double discriminant;
    int a,b,c;
    do{
     a=Integer.parseInt(JOptionPane.showInputDialog("enter value of a:"));
     b=Integer.parseInt(JOptionPane.showInputDialog("enter value of b:"));
     c=Integer.parseInt(JOptionPane.showInputDialog("enter value of c:"));
    discriminant=b*b-4*a*c;
    if(a==0){
JOptionPane.showMessageDialog(null, "coefficient a cannot be 0!:");

    }
   else if (discriminant<=0){
JOptionPane.showMessageDialog(null, "Discriminant is less than 0:");
   }
}while(a==0||discriminant <=0);


    Quad myquad=new Quad(a,b,c);
    JOptionPane.showMessageDialog(null,"roots x1="+myquad.computeQuad1());
    JOptionPane.showMessageDialog(null,"roots x2="+myquad.computeQuad2());

}


}