import javax.swing.JOptionPane;

class storagechecker{
    public static void main(String args[]){
        int size=Integer.parseInt(JOptionPane.showInputDialog("enter array size:"));
        int[]array=new int[size];

        for(int i=0;i<size;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("enter elements in array:"+(i+1)+":"));
        }
        int num=Integer.parseInt(JOptionPane.showInputDialog("enter number to check:"));

        boolean found=false;
        for(int i:array){
            if(i==num){
                found=true;
                break;
            }
        }
        if(found){
            JOptionPane.showMessageDialog(null, "the number is stored:"+ num);
        }else{
            JOptionPane.showMessageDialog(null, "the number is not stored:"+ num);

        }
        }

    }
