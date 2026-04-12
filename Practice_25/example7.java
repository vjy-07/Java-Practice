import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
		    System.out.print("Invalid Input");
		    return;
		}
		for(int i=1;i<2*n;i++){
		    int start;
		    if(i<=n) start = n-i+1;
		    else start = i-n+1;
		    
		    for(int j =start; j<=n;j++){
		        System.out.print(j);
		    }
		    for(int j=n-1;j>=start;j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
