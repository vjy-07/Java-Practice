import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);

	static short m1(int a){
		System.out.println("in method m1");
		return sc.nextShort();
	}

	String m2(){
		System.out.println("in method m2");
		m3(sc.nextInt());
		return sc.next();
	}

	static void m3(int b){
		System.out.println("in method m3");
		m1(sc.nextInt());
	}

	public static void main(String[] args){
		new A().m2();
	}
}