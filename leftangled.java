class leftangled {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int space = rows -i; space > 0; space--) {
                System.out.print(" "); // spaces
            }
            for (int j = 0; j < 1+ i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
