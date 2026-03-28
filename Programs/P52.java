import java.util.Scanner;

class A{
    static Scanner sc = new Scanner(System.in);
    boolean m1(String s){
        System.out.print("A");
        return sc.nextBoolean();
    }    
}

class B extends A{
    boolean m1(String s){
        super.m1(sc.next());
        System.out.print("B");
        return sc.nextBoolean();
    }
}

class C extends B{
    boolean m1(String s){
        super.m1(sc.next());
        System.out.print("C");
        return sc.nextBoolean();
    }
}

class Main{
    public static void main(String[] args){
        C obj = new C();
        obj.m1(A.sc.next());
    }
}

