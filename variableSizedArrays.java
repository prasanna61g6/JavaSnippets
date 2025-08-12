
import java.util.Arrays;
public class variableSizedArrays {
    public static void main(String[] args) {
        // variable sized arrays
        // arrays of varying lengths
        // java allows variable sized inner most arrays
        int[][] mat = {{10,20,30},   // length - 1
                        {10,20,30,40,50},  // length - 5
                         {10}};  // length - 1
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int[][] num = new int[3][];
        num[0] = new int[5];
        num[1] = new int[10];
        num[2] = new int[20];
        for(int i=0;i<num.length;i++) {
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println(Arrays.deepToString(num));
    }
}
