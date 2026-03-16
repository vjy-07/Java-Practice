import java.util.Scanner;
class Main
{
    static int lcm(int a, int b, int h){
        for(int i=h; ; i+=h){
            if(i%a==0 && i%b==0){
                return i;
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int h = (n1>n2)?n1:n2;
		System.out.print(lcm(n1,n2,h));
	}
}