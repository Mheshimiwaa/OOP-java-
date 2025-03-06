class Table {
    public static void main(String args[]) {
        int size = 10;
        int table[][] = new int[size][size];

        // Fill the table such that each row starts with its respective row index
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = i + j;
            }
        }

        // Print the table data with spaces between the numbers
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", table[i][j]);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
