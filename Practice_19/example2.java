import java.util.Scanner;
class Main
{
    static int lcm(int n1, int n2){
        int h = n1>n2?n1:n2;
        for(int i=h;;i+=h){
            if(i%n1==0 && i%n2==0){
                return i;
            }
        }
    }
    static int gcd(int n1, int n2){
        int l = n1>n2?n2:n1;
        for(int i=l;;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(lcm(n1,n2));
		System.out.println(gcd(n1,n2));
	}
}
