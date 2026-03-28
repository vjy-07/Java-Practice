import java.util.Scanner;

class A{
    static Scanner sc = new Scanner(System.in);
    int a = 10;
    void m1(){
        System.out.print("m1 in A");
    }
    A(int a){
        System.out.print(a);
        System.out.print(this.a);
    }
}
class B extends A{
    int a = 20;
    void m1(){
        System.out.print(this.a);
        System.out.print(super.a);
        super.m1();
    }
    B(){
        super(sc.nextInt());
    }
}

class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.m1();
    }
}

