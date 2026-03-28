import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		int dec = 0, c=0;
		for(int i=hex.length()-1;i>=0;i--){
		    int val =0;
		    char ch = hex.charAt(i);
		    if(ch>='0'&& ch<='9'){
		        val = ch-'0';
		    }
		    else if(ch>='A' && ch<='F'){
		        val = ch-55;
		    }
		    else if(ch>='a' && ch<='f'){
		        val = ch-87;
		    }
		    else if(ch=='-') continue;
		    dec+=val*(int)Math.pow(16,c++);
		}
		System.out.print(hex+" -> "+dec);
		
	}
}
