import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String result = switch(day) {
            // case 1 -> "Monday";
            // case 2 -> "Tuesday";
            // case 3 -> "Wednesday";
            // case 4 -> "Thursday";
            // case 5 -> "Friday";
            // case 6 -> "Saturday";
            // case 7 -> "Sunday";
            case 1,2,3,4,5 -> "Weekday";
            case 6,7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}
