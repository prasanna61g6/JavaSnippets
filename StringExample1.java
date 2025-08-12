// Strings

import java.util.Arrays;

public class StringExample1 {
  public static void main(String[] args) {
    // Immutability, mutability
    // Mutability -> The ability to change even after creationn
    // Java Strings are immutable
    // Java Strings are not primitive types
    // They are called as reference types
    // String is a class in java
    // the all the strings created using String class
    // are objects of class
    // java.lang packages contains String class
    // int, short, byte, long, double, float, boolean
    // char
    String s = "hello world";
    //          012345578910
    // access -> str_name[index], s[0], s[10]
    // to access a character from string
    // you need to use charAt() method
    // string_name.charAt(index_value);
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(3));
    // length() method is used to find out
    // how many characters are there in the string
    // strign_name.length();
    int len = s.length();
    System.out.println(len);
    // Run a loop on String?
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i) + "-->" + (int)s.charAt(i));
    }
    // Run a loop on string backwards
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.println(s.charAt(i));
    }
    // Coverting to lowerCase and uppercase
    String originalString = "ADITYA";
    String lowerCaseVersion = originalString.toLowerCase();
    System.out.println(lowerCaseVersion);
    System.out.println(originalString);
    String upperCaseVersion = lowerCaseVersion.toUpperCase();
    System.out.println(upperCaseVersion);
      // Turing Machines
      // WWII
      // German --> Enigma
      // The Imitation Game
      // Turing Machine
      // Alan Turing 
      // Turing Award
    // toCharArray
    String x = "technicalhab";
    //          01234567891011
    // Converting string into character array
    // toCharArray()
    char[] arr = x.toCharArray();
    System.out.println(Arrays.toString(arr));
    arr[10] = 'u'; // changing 'a' at 10 index into 'u'
    System.out.println(Arrays.toString(arr));
    // Converting character array back into string
    String outputString = new String(arr);
    System.out.println(outputString.toUpperCase());
  }
}
