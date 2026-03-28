import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String bin = sc.next();
		int dec = 0, c=0;
		for(int i=bin.length()-1;i>=0;i--){
		    char ch = bin.charAt(i);
		    if(ch=='0' || ch=='1'){
		        dec+=(ch-'0')*(int)Math.pow(2,c++);
		    }
		    else if(ch>='A' && ch<='Z'){
		        System.out.print("Invalid input because of Capital characters");
		        return;
		    }
		    else if(ch>='a' && ch<='z'){
		        System.out.print("Invalid input because of small characters");
		        return;
		    }
		    else if(ch>='2' && ch<='9'){
		        System.out.print("Invalid input because of invalid Digits");
		        return;
		    }
		    else{
		        System.out.print("Invalid input because of Special characters");
		        return;
		    }
		}
		    String hex="";
		    int temp = dec;
		    while(dec>0){
		        int r = dec%16;
		        if(r>=0 && r<=9){
		            hex = r+hex;
		        }
		        else{
		            hex = (char)(r+55)+hex;
		        }
		        dec/=16;
		    }
		    if(temp==0){
		        System.out.print("0");
		    }
		    else{
		        System.out.print(hex);
		    }
	}
}
