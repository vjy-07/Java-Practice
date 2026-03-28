import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String oct = sc.next();
		int dec = 0, c = 0;
		for(int i=oct.length()-1;i>=0;i--){
		    int val = 0;
		    char ch = oct.charAt(i);
		    if(ch>='0' && ch<='7'){
		        val = ch-'0';
		        dec+=val*(int)Math.pow(8,c++);
		    }
		    else if(ch=='-') continue;
		    else{
		        System.out.print("InvalId Input");
		        return;
		    }
		}
		String Hexa="";
		int temp = dec;
		while(dec>0){
		    int r = dec%16;
		    if(r>=0 && r<=9){
		        Hexa = r+Hexa;
		    }
		    else if(r>=10 && r<=15){
		        Hexa = (char)(r+55) + Hexa;
		    }
		    dec/=16;
		}
		if(temp==0){
		    System.out.print("0");
		}else{
    		System.out.print(Hexa);
		}
	}
}
