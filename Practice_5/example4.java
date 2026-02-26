import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a =0, b=1;
		int sum=0;
		while(a<=n){
		    sum+=a;
		    int c = a+b;
		    a=b;
		    b=c;
		}
		System.out.print((float)sum/n);
	}
}