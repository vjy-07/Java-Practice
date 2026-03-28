import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		if(dec<0){
		    System.out.print("INVALID Input");
		    return;
		}
		if(dec==0){
		    System.out.print("ZERO");
		    return;
		}
		String oct ="";
		while(dec>0){
		    int r = dec%8;
		    oct=r+oct;
		    dec/=8;
		}
		System.out.print(oct);
	}
}
