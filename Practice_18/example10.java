import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String oct = sc.next();
		int dec = 0, c=0;
		for(int i=oct.length()-1;i>=0;i--){
		    char ch = oct.charAt(i);
		    if(ch>='0' && ch<='7'){
		        dec+=(ch-'0')*(int)Math.pow(8,c++);
		    }
		    else{
		        System.out.print("InvalId Input");
		        return;
		    }
		}
		String bin="";
		int temp = dec;
		while(dec>0){
		    int r = dec%2;
		    bin = r+bin;
		    dec/=2;
		}
		if(temp==0){
		    System.out.print("0");
		}
		else{
		    System.out.print(bin);
		}
	}
}
