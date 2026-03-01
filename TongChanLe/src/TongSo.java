import java.util.Scanner;
public class TongSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n%2==0) {//neu n chan
			i=2;
		}else {//n le
			i=1;
		}
		long sum=0;
		for(;i<=n;i+=2) {
			sum+=i;
		}
		System.out.println("KETQUA = "+sum);
	}

}
