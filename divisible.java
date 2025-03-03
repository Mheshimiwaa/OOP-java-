/*class Divisible {
    public static void main(String args[]) {
      for (int i = 0; i < 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("Divisible numbers are: " + i);
        }
      }
    }
  }
  */

  class Divisible {
    public static void main(String args[]) {
      int i = 0;
      do {
        if (i % 3 == 0 || i % 5 == 0) {
          System.out.println("Divisible numbers are: " + i);
        }
        i++;
      } while (i < 100);
    }
  }
  