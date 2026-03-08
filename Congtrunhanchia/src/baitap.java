import java.util.Scanner;
public class baitap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao doi tuong scanner
		Scanner sc = new Scanner(System.in);
		// nhap 2 so nguyen a, b 
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		if(b != 0) System.out.println(a + " / " + b + " = " + ((double)a / b));
		sc.close();
	}
}
