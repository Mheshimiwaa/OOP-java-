import javax.swing.*;


public class maxandmin {
   public static void main(String[] args) {
    int[]array=new int[10];//initializes the array size

    for(int i=0;i<10;i++){//loops hrough entering the elements of the array
        array[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the number "+(i+1)+" for array: "));
    }
    int biggest=array[0];
    for(int i=1;i<10;i++){//comparison starts from the second element
        if(array[i]>biggest){
            biggest=array[i];
        }
    }
JOptionPane.showMessageDialog(null,"The maximum value is: "+biggest);

    int smallest=array[0];
    for(int i=1;i<10;i++){//comparison starts from the second element
        if(array[i]<smallest){
            smallest=array[i];
        }
    }
        JOptionPane.showMessageDialog(null,"The minimum value is: "+smallest);
   }
}