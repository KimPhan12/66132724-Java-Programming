import java.util.Scanner;
public class LietkeUS {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
			System.out.print(i+ " ");
			}
		}
		System.out.println("\nn co "+count+" uoc so");
	}
}
