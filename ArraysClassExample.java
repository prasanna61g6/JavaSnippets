import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collections;
public class ArraysClassExample {
  public static void main(String[] args) {
    // Arrays class
    // Arrays class is present in java.util package
    // The Arrays class contain some utility method
    // which will help do some operations on array easily
    // 1. toString(), 2. equals(), 3. sort(), 4. compare()
    // 1. toString() method
    // Used to give a quick look of the array in the form of a
    // list. Using this helps avoid writing the loop to see
    // what are the array elements
    // Syntax: Arrays.toString(array_name);
    int[] intArray = {10, 20, 30, 40, 50};
    System.out.println(Arrays.toString(intArray));
    String[] names = {"tokyo", "rio", "berlin", "professor"};
    String resultString = Arrays.toString(names);
    System.out.println(resultString);
    // Arrays.equals()
   // Used to compare two arrays and return true, if they are equal
   // false, if they are not equal
   // Arrays.equals(arr1, arr2) -> boolean -> true / false
   int A[] = {10, 20, 40}; // 40 > 30 -> positive 1
   int B[] = {10, 20, 30}; // 30 < 40 --> negative -1
   if (Arrays.equals(A, B)) {
    System.out.println("Both arrays are same");
   } else {
    System.out.println("Both arrays are not same");
   }
    // Arrays.compare(arr1, arr2)
    // Which array is greater or smaller or equal
    // return type is integer -> -1, or 1, or 0
    // -1 -> when first array is smaller than second
    // 1 --> when first array is greater than second
    // 0 --> when both arrays are equal
    System.out.println(Arrays.compare(B, A));

    // Arrays.fill()
    // fill() is used to fill all the elements
    // of an array with a single value
    // Syntax: Arrays.fill(arr_name, value);
    int[] d = new int[10]; // all the elements are 0s
    System.out.println("Before filling: " + Arrays.toString(d));
    Arrays.fill(d, -1); // filling all array elements with -1
    System.out.println("After filling: " + Arrays.toString(d));
    boolean bArray[] = new boolean[20];// default value: false
    Arrays.fill(bArray, true);
    
    // Arrays.sort()
    // Used to sort the given array in-place
    int[] integerArray = {7, 6, -2, 1, 4}; // {-2, 1, 4, 6, 7}
    int[] copyOfArray = integerArray.clone();
    System.out.println("Before sorting: " + Arrays.toString(integerArray));
    Arrays.sort(integerArray); // sorting an integer array
    System.out.println("After sorting: " + Arrays.toString(integerArray));
    System.out.println(Arrays.toString(names));
    Arrays.sort(names); // string array
    System.out.println(Arrays.toString(names));
    // Arrays.binarySearch(), Arrays.mismatch(), Arrays.copyOf()
    String s1 = "hello";

    
  }
}
