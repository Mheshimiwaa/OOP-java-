class Isuzu {
    public static void main(String[] args) {
        int rows = 4; // height and base length of each triangle

        // Left and Right Triangles facing each other
        for (int i = 0; i < rows; i++) {
            // Left triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in between
            for (int space = 0; space < 2 * (rows - i - 1); space++) {
                System.out.print(" ");
            }
            // Right triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
