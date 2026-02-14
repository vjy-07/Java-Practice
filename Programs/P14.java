import java.util.Scanner;
public class P14 {
    static Scanner sc = new Scanner(System.in);
    void m1(int a){
        System.out.println(a);
    }
    void m2(int a, int b){
        m1(sc.nextInt());
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        P14 obj = new P14();
        obj.m2(sc.nextInt(),sc.nextInt());
    }
}
