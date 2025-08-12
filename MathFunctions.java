public class MathFunctions {
  public static void main(String[] args) {
    // Java's lang package contains a class called
      // Math, Math class contains some method
      // sqrt(), pow(), abs(), ceil(), floor()
    // max(), min()
    System.out.println(Math.sqrt(25));
    int sq = (int)Math.sqrt(30); // 5
    double sq1 = Math.sqrt(30);
    System.out.println(sq);
    System.out.println(sq1);
    int a = -12;
    System.out.println(Math.abs(a));
    System.out.println(Math.pow(2, 3));
    // min and max
    int x = 10;
    int y = 20;
    int smallest = x < y ? x : y;
    System.out.println(smallest);
    System.out.println(Math.min(x, y));
    System.out.println(Math.max(x, y));
    System.out.println(Math.max(Math.max(10, 20), 30));
  }
}
