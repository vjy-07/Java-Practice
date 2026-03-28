import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		String bin = sc.next();
		int dec= 0, c=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch = bin.charAt(i);
		    if(ch=='0' || ch=='1'){
		        dec+=(ch-'0')*(int)Math.pow(2,c++);
		    }
		    else{
		        System.out.print("Invalid InPut");
		        return;
		    }
		}
		String oct="";
		int temp = dec;
		while(dec>0){
		    int r = dec%8;
		    oct=r+oct;
		    dec/=8;
		}
		if(temp==0){
		    System.out.print("0");
		}
		else{
		    System.out.print(oct);
		}
	}
}
