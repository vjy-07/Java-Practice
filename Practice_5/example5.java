import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a =0, b=1;
		for(int i=1;i<=2*n;i++){
		    if(i%2==1){
		        System.out.print(a+" ");
		    }
		    int c= a+b;
		    a=b;
		    b=c;
		}
	}
}