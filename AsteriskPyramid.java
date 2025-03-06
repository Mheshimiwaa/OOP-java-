class AsteriskPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i <= rows; i++) { 
            for (int space = rows - i; space > 0; space--) { 
                System.out.print(" "); 
            }
            for (int j = 1; j <= (2*i-1); j++) { 
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
