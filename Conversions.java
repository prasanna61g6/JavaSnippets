public class Conversions {
  public static void main(String[] args) {
    // Strings into integers
    // Integer class contains some methods
    // which will help us convert numbers into string
    // and strings into numbers
    String num = "54";
    // Integer.parseInt(); -> Takes a string and returns
    // it's integer representation in Base-10 (Decimal System)
    int val = Integer.parseInt(num);
    System.out.println(val * val);
    // Converting a binary into decimal
    String binaryString = "11011";
    System.out.println(Integer.parseInt(binaryString, 2));
    // Converting a hexa-decimal into decimal
    System.out.println(Integer.parseInt("1b", 16));
    // Converting a octal string into decimal value
    System.out.println(Integer.parseInt("33", 8));

    // integer to string convertion
    // toString() is used to convert a number into a string
    int i = 123; // "123"
    String s = Integer.toString(i);
    System.out.println(s.length());
    int x = 27;
    // Binary of 27
    System.out.println(Integer.toString(x, 2));
    // Octal of 27
    System.out.println(Integer.toString(x, 8));
    // Hexa-Decimal of 27
    System.out.println(Integer.toString(x, 16));

    String hexString = "1fa2d";
    System.out.println(Integer.toString(Integer.parseInt(hexString, 16), 2));
    // Integer.toHexString() --> base-16
    // Integer.toBinaryString(i) --> base-2
    // Integer.toOctalString() --> base-8
  }
}
