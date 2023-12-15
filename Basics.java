import java.util.Scanner;

public class Basics {
    public static Scanner scn = new Scanner(System.in);

    // pow function
    public static int powerequaldigit(int n) {
        int pow = 1;
        n /= 10;
        while (n != 0) {
            pow *= 10;
            n /= 10;
        }
        return pow;
    }

    // digit of number in forward order
    public static void digitofanumber(int n) {
        int pow = powerequaldigit(n);

        while (pow != 0) {
            int quo = n / pow;
            n %= pow;
            pow /= 10;
            System.out.println(quo);
        }
    }

//


///
    //Rotate a number

    public static void main(String[] args) {
        digitofanumber(4644645);
    }
}