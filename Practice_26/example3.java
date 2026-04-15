import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=Math.abs(sc.nextInt());
		if(n==0){
		    System.out.print("Invalid Input");
		    return;
		}
		int temp = 1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        if(temp<10) System.out.print("  ");
		        else System.out.print("  ");
		    }
		    for(int j=1;j<=i;j++){
		        if(temp<10) System.out.print("0"+temp+++"  ");
		        else System.out.print(temp+++"  ");
		    }
		    System.out.println();
		}
	}
}
