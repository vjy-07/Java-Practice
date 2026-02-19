import java.util.Scanner;
public class P23 {
    static Scanner sc = new Scanner(System.in);
    static void m1(){
        System.out.println("method m1");
        m2(sc.nextInt());
    }
    static void m2(int a){
        System.out.println("method m2");
        System.out.println(m3());
    }
    static int m3(){
        System.out.println("method m3");
        System.out.println(m4(sc.nextInt()));
        return sc.nextInt();
    }
    static int m4(int b){
        System.out.println("method m4");
        new P23().m5();
        return b;
    }
    void m5(){
        System.out.println("method m5");
        m6(sc.nextInt());
    }
    void m6(int c){
        System.out.println("method m6");
        System.out.println(m7());
    }
    int m7(){
        System.out.println("method m7");
        System.out.println(m8(sc.nextInt()));
        return sc.nextInt()
;    }
    int m8(int d){
        System.out.println("method m8");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        m1();
    }
}
