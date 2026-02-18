import java.util.Scanner;
public class P22 {
    static Scanner sc = new Scanner(System.in);
    int m1(){
        return sc.nextInt();
    }
    static int m2(){
        P22 obj = new P22();
        int x = obj.m1();
        return x;
    }
    public static void main(String[] args) {
        System.out.println(m2());
    }
}
