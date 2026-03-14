import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lowest = (n1>n2) ?  (lowest = n2):(lowest=n1);
		for(int i=lowest;i>=1;i--){
		    if(n1%i==0 && n2%i==0){
		        System.out.print(i);
		        break;
		    }
		}
	}
}