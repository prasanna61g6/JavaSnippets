class ArrayCloneExample {
  public static void main(String[] args) {
    int A[] = {10, 20, 30};
    int[] B = A.clone(); // Duplicating array using clone
    B[1] = 200;
    System.out.println(A[1]); // Still 20
  }
}