import java.util.Arrays;
public class MethodOverloadingExample1 {
  // overloaded method
  static void add(int a, int b) {
    System.out.println(a + b);
  }
  // overloaded method -> change in no. of parameters
  static void add(int a, int b, int c) {
    System.out.println(a + b + c);
  }
  // overloaded method -> change in no. of parameters
  static void add(int a, int b, int c, int d) {
    System.out.println(a + b + c + d);
  }
  // overloaded method -> change in type of parameter
  static void add(double a, double b) {
    System.out.println(a + b);
  }
  // overloaded method -> change in type of parameter
  static void add(int[] A) {
    int sum = 0;
    for (int eachElement: A) {
      sum += eachElement;
    }
    System.out.println(sum);
  }
  // overloaded method -> change in type of parameter
  static void add(String s) {
    System.out.println(s.charAt(0) + s.charAt(s.length() - 1));
  }
  // by changing the order of parameters
  static void add(String x, int p) {
    System.out.println(x.charAt(0) + p);
  }
  // by changing the order of parameters
  static void add(int p, String x) {
    System.out.println(p + x.charAt(x.length() - 1));
  }
  public static void main(String[] args) {
    int a = 10;
    float p = 2.1f;
    double x = 77.81;
    boolean b = false;
    char ch = '#';
    // println() is overloaded method
    System.out.println();
    System.out.println(a);
    System.out.println(p);
    System.out.println(x);
    System.out.println(b);
    System.out.println(ch);

    // Arrays.fill() --> 
    int[] A = new int[10];
    Arrays.fill(A, -1);
    System.out.println(Arrays.toString(A));
    boolean[] B = new boolean[20];
    Arrays.fill(B, true);
    System.out.println(Arrays.toString(B));
    // Math.min(), Math.max()
    // 1. Return type
    // 2. What are the parameters
    //    1. Type 
    //    2. Count of them
    // Is this method contains overloads?
    // Integer.parseInt()
  }
}
