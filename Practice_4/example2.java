import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=n1;i<=n2;i++){
		    int fc = 0;
		    for(int j=2;j<=(int)Math.sqrt(i);j++){
		        if(i%j==0){
		            fc++;
		        }
		    }
		    if(fc==0 && i>1) System.out.print(i+" ");
		}
	}
}
