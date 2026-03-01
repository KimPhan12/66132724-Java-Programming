import java.util.Scanner;

public class SoNTo {

    public static void main(String[] args) {

        int n;
        n = new Scanner(System.in).nextInt();

        int count = 0;
        int x = 2;

        while (true) {

            if (isNgTo(x)) {
                System.out.print(x + " ");
                count++;
            }

            if (count == n) {
                break;
            }

            x++;  // ✔ thêm dòng này
        }
    }

    public static boolean isNgTo(int n) {

        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}