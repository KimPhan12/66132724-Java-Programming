import java.util.Scanner;

public class PTSO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int i = 2;

        System.out.print(original + " = ");

        while (n != 1) {
            if (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print(" x ");
                }
            } else {
                i++;
            }
        }
    }
}