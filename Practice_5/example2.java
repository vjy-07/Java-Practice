import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a =0, b=1;
		while(a<n2){
		    if(a>n1){
    		    System.out.print(a+" ");
		    }
		    int c = a+b;
		    a=b;
		    b=c;
		}
	}
}