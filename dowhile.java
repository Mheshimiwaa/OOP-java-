class dowhile{
    public static void main(String args[]){
        int num=1;
        do{
            if(num %3==0&&num%5==0){
                System.out.println(num);
            }
            num++;
        }while(num<=100);
    }
}