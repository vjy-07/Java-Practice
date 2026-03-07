import java.util.Scanner;
class J{
	static Scanner sc = new Scanner(System.in);
	int a;
	static int m1(int b){
		System.out.println("in method m1");
		return b;
	}
	void m2(int m){
		System.out.println("in method m2");
	}

	J(J obj){
		System.out.println("Copy Constructor");
	}
	J(String s){
		this(new J());
		System.out.println("String parameterized");
	}
	J(int a){
		this(sc.next());
		this.a=a;
		System.out.println("int parameterized");
	}
	J(){

	}

	public static void main(String[] args){
		new J(sc.nextInt()).m2(m1(sc.nextInt()));
	}
}