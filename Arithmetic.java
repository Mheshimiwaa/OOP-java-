//mean, median, standard deviation
import javax.swing.*;
import java.util.Arrays;

class Arithmetic{
    public static void main(String args[]){
        
         int arraySize=Integer.parseInt(JOptionPane.showInputDialog("Enter array size"));
        int array[]=new int[arraySize];
      

int sum=0;//mean
       for(int i=0;i<arraySize;i++){
        array[i]=Integer.parseInt(JOptionPane.showInputDialog("enter elements in array"+(i+1)+":"));
        
        sum += array[i];
        }
         double mean=(double) sum/arraySize;

        Arrays.sort(array);//median
        double median;
        if(arraySize % 2==0){
            median=(array[arraySize/2-1]+array[arraySize/2])/2.0;
        }else{
            median=array[arraySize/2];
        }
        double sumsquareddiffs=0.0;
        for(int i=0;i<arraySize;i++){
            sumsquareddiffs +=Math.pow(array[i]-mean,2);
        }
        double variance=sumsquareddiffs / arraySize;
        double standarddeviation=Math.sqrt(variance);
        
       
       JOptionPane.showMessageDialog(null,"mean of elements"+ mean);
       JOptionPane.showMessageDialog(null,"median of elements"+ median);
       JOptionPane.showMessageDialog(null,"standarddeviation of elements"+ standarddeviation);

}

    }

