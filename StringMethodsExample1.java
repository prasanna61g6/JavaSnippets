import java.util.Arrays;
public class StringMethodsExample1 {
  public static void main(String[] args) {
    // It's possible in Java to create a string
    // by gradually adding characters / other strings
    // to it
    String[] names = {"abc", "def", "ghi", "jkl"};
    String ansString = "";
    for (String eachString: names) {
      ansString += eachString.charAt(0);
    }
    System.out.println(ansString);

    String a = "university"; // sorted: "eiinrstuvy"
    // toCharArray() --> Used to convert a string into
    // a character array
    // 1. Convert the string into char array
    char[] arr = a.toCharArray();
    // 2. Since arrays can be sorted, using Arrays.sort()
    Arrays.sort(arr);
    // 3. Convert the character array back into string
    String result = new String(arr);
    System.out.println(result);

    // Running a for each loop on string
    // needs conversion to a charArray
    String string = "hello world";
    for (char eachCharacter: string.toCharArray()) {
      System.out.println(eachCharacter);
    }
    // Methods for lexicographical comparison on strings
    // equals(), compareTo(), equalsIgnoreCase(),
    // compareToIgnoreCase()
    // equals() --> returns a boolean value 
    // true --> if string1 is equal to string2
    // false --> otherwise
    String s1 = "aBc"; // 66
    String s2 = "abc"; // 98
    boolean res = s1.equals(s2);
    System.out.println(res);
    // equalIgnoreCase
    String s3 = "abc";
    String s4 = "ABC";
    System.out.println(s3.equalsIgnoreCase(s4)); // abc is same as ABC
    // compareTo()
    // Compares two strings and returns an integer
    // a negative value if, s1 is less than s2
    // a positive value if, s1 is greater than s2
    // a 0, if s1 == s2
    String s5 = "pavan";
    String s6 = "ashok";
    System.out.println(s5.compareTo(s6));
    System.out.println(s6.compareTo(s5));

    String s7 = "abc";
    String s8 = "ABC";
    System.out.println(s7.compareToIgnoreCase(s8)); // same

    // contains()
    // Used to check if sequence of characters is a part of a string
    // or not
    String sentence = "java is a goat programming language";
    String word = "goat";
    char ch = 'g';  // "g"
    System.out.println(sentence.contains(""+ch));// compilation error
    boolean ans = sentence.contains(word); // is the word present in sentence?
    System.out.println(ans);
    System.out.println(sentence.contains("mmi")); // true
    System.out.println(sentence.contains("lnu")); // false
    String vowels = "aeiouAEIOU";
    System.out.println(vowels.contains("" + ch));

    // isEmpty(), isBlank() --> boolean --> true, false
    // isEmpty(), check if there are any characters present in the string
    // or not
    String x = "abc";
    System.out.println(x.isEmpty());
    String y = "   ";
    String z = "";
    System.out.println(y.isEmpty());
    System.out.println(y.length());
    System.out.println(z.isEmpty());
    System.out.println(y.isBlank()); // true

    // split() --> split is used to split a string
    // based on a delimeter
    // the return type of split() is an array of strings
    sentence = "java is a GOAT programming language";
    // space is a delimiter
    // "java", "is", "a", "GOAT"
    // "java", "is", "a", "GOAT", "programming", "language";
    String words[] = sentence.split(" "); // splitting using space
    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
    String date = "28-07-2025";
    System.out.println(Arrays.toString(date.split("-")));

    // indexOf() 
    // used to give the first index of a character or substring
    // in a string (If not exists returns -1)
    word = "James Gosling";
    char ch1 = 'e';
    char ch2 = 'z';
    System.out.println(word.indexOf(ch1));
    System.out.println(word.indexOf(ch2));
    word = "java";
    char ch3 = 'a';
    System.out.println(word.indexOf(ch3, 2));
    // lastIndexOf() --> explore this method

    // start and end check using
    // startswith(), endswith()
    // endswith() is used to check if a string ends with
    // another substring (suffix) or not
    String filename = "java_examples.pdf"; // '.mp3', '.mp4', '.jpeg'
    System.out.println(filename.endsWith(".pdf")); // true
    String[] rollnums = {"24B11CS250", "24P31A4260"};
    for (String eachRollNumber: rollnums) {
      if (eachRollNumber.startsWith("24P3")) {
        System.out.println(eachRollNumber + " --> " + "ACET");
      } else {
        System.out.println(eachRollNumber + " --> " + "AUS");
      }
    }
  }
}
