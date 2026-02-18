import java.util.Scanner;
class example1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fc = 0;
		for(int i=2;i<=(int)Math.sqrt(n);i++){
		    if(n%i==0) fc++;
		}
		if(fc==0 && n>1){
		    System.out.println("prime number");
		}
		else{
		    System.out.println("not a prime number");
		}
	}
}
