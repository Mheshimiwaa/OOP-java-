import javax.swing.*;
class supermarket{

    static double computetotalcost(){
    double sugar=100;
    double cookingFat=200;
    double flour=120;
    double tealeaves=50;

    int qtysugar=Integer.parseInt(JOptionPane.showInputDialog("enter quantity of sugar in kg"));
    int qtycookingFat=Integer.parseInt(JOptionPane.showInputDialog("enter quantity of cookingFat in kg"));
    int qtyflour=Integer.parseInt(JOptionPane.showInputDialog("enter quantity of flour in packets"));
    int qtytealeaves=Integer.parseInt(JOptionPane.showInputDialog("enter quantity of tealeaves in packets"));

    double totalCost=sugar*qtysugar + cookingFat*qtycookingFat + flour*qtyflour + tealeaves*qtytealeaves;

    double discount=0.90;

    if((qtysugar>=2 &&(qtycookingFat>0 || qtyflour>0 || qtytealeaves>0))||
    (qtycookingFat>=2&&(qtysugar>0 || qtyflour>0 || qtytealeaves>0))||
    (qtyflour>=2 &&(qtycookingFat>0 || qtysugar>0 || qtytealeaves>0))||
    (qtytealeaves>=2 &&(qtycookingFat>0 || qtyflour>0 || qtysugar>0))){
        totalCost*=discount;
    JOptionPane.showMessageDialog(null, "total cost is"+ totalCost);
    }
    double moneyPaid=Double.parseDouble(JOptionPane.showInputDialog("The money paid is: "));
    double change=moneyPaid-totalCost;
    JOptionPane.showMessageDialog(null,"change is :"+ change);

    return totalCost;
    }

public static void main(String args[]){

    JOptionPane.showMessageDialog(null, "total cost is"+computetotalcost());
}
}

