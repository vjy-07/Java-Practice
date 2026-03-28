import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int dec = Math.abs(sc.nextInt());
		if(dec==0){
		    System.out.print("Zero");
		    return;
		}
		String bin = "";
		
		while(dec>0){
		    int r = dec%2;
		    bin = r+bin;
		    dec/=2;
		}
		System.out.print(bin);
	}
}
