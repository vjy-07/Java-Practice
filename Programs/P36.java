import java.util.Scanner;
class B{
	static Scanner sc = new Scanner(System.in);
	B(int a, float b, char ch){
		System.out.println("Triple Parameterized");
	}
	B(String s, short d){
		this(sc.nextInt(),sc.nextFloat(),sc.next().charAt(0));
		System.out.println("Double Parameterized");
	}
	B(byte c){
		this(sc.next(),sc.nextShort());
		System.out.println("Single Parameterized");
	}
	B(){
		this(sc.nextByte());
		System.out.println("Default");
	}
	public static void main(String[] args){
		B obj = new B();
	}
}