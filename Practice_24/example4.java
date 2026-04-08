import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0){
		    System.out.print("Invalid Input");
		    return;
		}
		if(n<0){
		    System.out.print("Given Input is Negative");
		    return;
		}
		for(int i=1;i<=n;i++){
		    int t=1;
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(t+ " ");
		        t=t*(i-j)/j;
		    }
		    System.out.println();
		}
	}
}
