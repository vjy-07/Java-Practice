import java.util.Scanner;
class Main
{
    static int hcf(int a, int b, int l){
        for(int i=l;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int l = (n1>n2)?n2:n1;
		System.out.print(hcf(n1,n2,l));
	}
}