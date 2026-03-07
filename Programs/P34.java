import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	static int m1(int a){
		System.out.println("m1 method");
		return a;
	}
	static float m2(float b){
		System.out.println("m2 method");
		return b;
	}

	String m3(String s){
		System.out.println("m3 method");
		return s;
	}

	double m4(double d){
		System.out.println("m4 method");
		return d;
	}

	A(){
		this(sc.nextInt());
		System.out.println("default");
	}

	A(int a){
		System.out.println("parameterized");
	}

	public static void main(String[] args){
		A obj = new A();
		System.out.println(obj.m3(sc.next()));
		System.out.println(obj.m4(sc.nextDouble()));
		System.out.println(A.m1(sc.nextInt()));
		System.out.println(A.m2(sc.nextFloat()));
	}
}