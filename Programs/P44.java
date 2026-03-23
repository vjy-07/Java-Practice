import java.util.Scanner;
class A{
    int a = 10;
    void m1(){
        System.out.println("In m1 method");
    }
}
class Main extends A
{
    int a = 20;
    void m1(){
        System.out.print(a);
        System.out.print(super.a);
        super.m1();
    }
    public static void main(String[] args){
        Main m = new Main();
        m.m1();
    }
}
