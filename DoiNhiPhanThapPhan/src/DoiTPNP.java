import java.util.Scanner;
public class DoiTPNP {
	public class Doi {
		public static void chuyennp(int x)
		{
			if(x <= 1) System.out.print(x);
			else 
			{
				chuyennp(x / 2);
				System.out.print(x % 2);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			chuyennp(n);
			sc.close();
		}

	}
}
