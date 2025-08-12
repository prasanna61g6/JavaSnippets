public class ComparingCharacters {
  public static void main(String[] args) {
    // Character is associated with number ASCII character set
    // UNICODE -> 0 to 65535 (2^16-1)
    // 1 million characters
    // size of char in Java --> 2 bytes
    // a - z --> 97-122
    // A - Z --> 65-90
    // 0 - 9 --> 48-57
    // space --> 32
    char ch1 = 'a'; // 97
    char ch2 = 'b'; // 98
    if (ch1 > ch2) System.out.println("Yes");
    else System.out.println("No");
    System.out.println((int)ch1); // Using type casting to print ASCII value
    System.out.println(ch2 - ch1); // 98-97 --> 1
    int x = 121;
    System.out.println(x);
    System.out.println((char)x); // Using typecasting to print character
    // A --> 3077
    int num = 3077;
    System.out.println((char)num);
  }
}
