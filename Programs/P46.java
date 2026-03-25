import java.util.Scanner;
class A{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    double d = sc.nextDouble();
    void m1(){
        System.out.println("Hi from m1");
    }
    A(boolean bo){
        System.out.print(bo);
    }
}
class B extends A{
    static int b = sc.nextInt();
    char ch = sc.next().charAt(0);
    B(){
        super(sc.nextBoolean());
        System.out.println("B cons");
    }
    {
        System.out.println("non static block in B");
    }
}
class C extends A{
    static int c = sc.nextInt();
    String s = sc.next();
    C(int v){
        super(sc.nextBoolean());
        System.out.print(v);
    }
    {
        System.out.println("non static block in C");
    }
}
class Main
{
	public static void main(String[] args) {
		B obj = new B();
		System.out.print(obj.d);
		System.out.print(obj.ch);
		C obj1 = new C(A.sc.nextInt());
		System.out.println(obj1.d);
		System.out.println(obj1.s);
	}
}