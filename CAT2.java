import javax.swing.*;
import java.util.Arrays;
class CAT2{
    public static void main(String args[]){
        int array[]=new int[10];
        int sum=0;
        double average;
        int max;
        int min;
        int evencount = 0;
        int oddcount=0;
        for(int i=0;i<10;i++){
             array[i]=Integer.parseInt(JOptionPane.showInputDialog("enter integers"+(i+1)+":"));
             sum+=array[i];
        }
        average=sum/10;
    Arrays.sort(array);
    min=array[0];
    max=array[array.length-1];
    for(int i=0;i<10;i++){
        if(i%2==0){
             evencount++;     
        }else{
            oddcount++;
        }
    } 
    System.out.println("sum:"+sum);      
    System.out.println("average:"+average);       
    System.out.println("max:"+max);       
    System.out.println("min:"+min);       
    System.out.println("oddcount:"+oddcount);       
    System.out.println("evencount:"+evencount);       
    }
}
