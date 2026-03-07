import java.util.Scanner;
public class dthcn {
	public static float dthcn(float dai, float rong)
	{
		return dai * rong; 
	}
	public static void main(String[] args) {
		// định nghĩa lớp Scanner
		Scanner sc = new Scanner(System.in);
		float dai, rong;
		dai = sc.nextFloat();
		rong = sc.nextFloat();
		float dt = dthcn(dai, rong);
		System.out.println("Dien tich cua hcn la " + dt);
		sc.close();
	}
}
