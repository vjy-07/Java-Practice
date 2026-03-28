import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int dec = Math.abs(sc.nextInt());
		if(dec==0){
		    System.out.print("Given Input is InValid.");
		    return;
		}
		String hex="";
		int temp = dec;
		while(dec>0){
		    int r = dec%16;
		    if(r>=0 && r<=9){
		        hex=r+hex;
		    }
		    else{
		        hex = (char)(r+55) + hex; 
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
