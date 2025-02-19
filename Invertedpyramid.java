class InvertedPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" "); // spaces
            }
            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
