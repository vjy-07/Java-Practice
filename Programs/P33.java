import java.util.Scanner;
class This{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	This(int a){
		this.a=a;
		System.out.print(a);
	}
	This(){
		this(sc.nextInt());
	}
	public static void main(String[] args){
		new This();
	}
}
