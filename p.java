class P {
    public static void main(String[] args) {
        double p = 1.0;
        int n = 18;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) // Fixed the syntax of the if condition
                p = p * 2;
            System.out.println(p); // Fixed the syntax for printing
        }
    }
}
