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
		    int val=0;
		    if(ch=='0' || ch=='1'){
		        val = ch-'0';
		    }
		    else{
		        System.out.print("Invalid InPut");
		        return;
		    }
		    dec+=val*(int)Math.pow(2,c++);
		}
		String oct="";
		int temp =dec;
		while(temp>0){
		    int r = temp%8;
		    oct=r+oct;
		    temp/=8;
		}
		if(dec==0){
		    System.out.print("0");
		}
		else{
		    System.out.print(oct);
		}
	}
}
