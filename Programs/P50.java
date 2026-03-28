import java.util.Scanner;

class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
class C extends A{
    C(){
        System.out.println("C");
    }
}
class D extends B{
    D(){
        System.out.println("D");
    }
}
class Main{
    public static void main(){
        D obj = new D();
        C obj1 = new C();
    }
}