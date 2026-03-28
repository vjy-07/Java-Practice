import java.util.Scanner;

class A{
    static Scanner sc = new Scanner(System.in);
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
class C extends B{
    C(int a){
        System.out.println("C");
    }
}
class D extends C{
    D(int b){
        super(sc.nextInt());
        System.out.println("D");
    }
}
class E extends D{
    E(){
        super(sc.nextInt());
        System.out.println("E");
    }
}

class Main{
    public static void main(String[] args){
        E obj = new E();
    }
}

