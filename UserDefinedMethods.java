
public class UserDefinedMethods {
    // non-static method
    int getSum(int a, int b) {
        return a+b;
    }

    // static method
    static int getProduct(int a, int b) {
        return a*b;
    }

    static boolean isFactor(int a, int b) {
        if(b%a==0) return true;
        else return false;
    }

    static void getString() {
        System.out.println("Hello");
    }

    static boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            return true;
        } else {
            return false;
        }
    }

    static void getBool(int a, int b, int c) {
        if(a*b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void isCharacter(char ch) {
        if(ch >= 'a' && ch <= 'z') {        // 97 - 122
            System.out.println("1");
        }
        if(ch >= 'A' && ch <= 'Z') {         // 65 - 90
            System.out.println("2");
        }
        if(ch >= '0' && ch <= '9') {        // 48 - 57
            System.out.println("3");
        }
    }

    static int digitSum(int num) {
        int sum = 0;
        while(num != 0) {
            int rem = num%10;
            sum += rem;
            num/=10;
        }
        return sum;

    }

    static char lastCharacter(String s) {
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        // calling a non-static method(2 step process)
        UserDefinedMethods u1 = new UserDefinedMethods();
        System.out.println(u1.getSum(10,20));
        
        // calling a static funtion(direct process)
        System.out.println(getProduct(10,20));

        System.out.println(isFactor(10,20));
        
        getString();

        getBool(2,3,6);

        System.out.println(isVowel('f'));

        isCharacter('A');

        System.out.println(digitSum(123));

        System.out.println(lastCharacter("java"));
    }


}
