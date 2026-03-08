import java.util.Scanner;
public class BaiTap1_TinhLuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double gioLam, luongGio, tongLuong;

        System.out.print("Nhập số giờ làm: ");
        gioLam = sc.nextDouble();

        System.out.print("Nhập lương theo giờ: ");
        luongGio = sc.nextDouble();

        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
            tongLuong = 40 * luongGio + (gioLam - 40) * luongGio * 1.5;
        }

        System.out.println("Tổng lương: " + tongLuong);

        sc.close();
	}

}
