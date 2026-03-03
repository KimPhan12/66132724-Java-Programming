package baitap;
import java.util.Scanner;
public class SoCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		n=scanner.nextInt();
		int count=0;
		if((m>=0&&n>=0) ||n>0) {
			 for(int i=m;i<=n;i++) {
				 if(i>=0) {
					 int res=(int)Math.sqrt(i);
					 if(res*res==i) {
						 count++;
						 System.out.printf("%10d",i);
						 if(count %10==0) {
							 System.out.println();
						 }
					 }
				 }
			 }
		}
		System.out.println("\nSo luong so chinh phuong thoa man la: " +count);
	}

}
