import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String bin = sc.next();
		int dec = 0,  c=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch = bin.charAt(i);
		    if(ch=='0' || ch=='1'){
		        dec+=(ch-'0')*(int)Math.pow(2,c++);
		    }
		    else{
		        System.out.print("InvAlid Input.");
		        return;
		    }
		}
		System.out.print(dec);
	}
}
