// package Programs;
import java.util.Scanner;
public class P1{
    static Scanner sc = new Scanner(System.in);
    static boolean b = sc.nextBoolean();
    static int i = sc.nextInt();
    char ch = sc.next().charAt(0);
    float f = sc.nextFloat();

    static void m1(){
        System.out.println("inside m1");
        P1 obj1 = new P1();
        System.out.println(b);
        System.out.println(i);
        System.out.println(obj1.ch);
        System.out.println(obj1.f);
        System.out.println("m2 inside m1");
        obj1.m2();
    }

    void m2(){
        System.out.println("inside m2");
        System.out.println(b);
        System.out.println(i);
        System.out.println(ch);
        System.out.println(f);

    }
    public static void main(String[] args){
        System.out.println("m1 from main");
        m1();
        System.out.println("m2 from main");
        P1 obj = new P1();
        obj.m2();
    }
}