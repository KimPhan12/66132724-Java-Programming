import java.util.Scanner;
public class TongND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(double)1/i;
		}
		System.out.println("KETQUA= "+sum);
	}

}
