import java.util.Scanner;
public class P21 {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int add(){
        return a+b;
    }
    static int multiply(){
        return a*b;
    }
    static int subtract(){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(multiply());
        System.out.println(subtract());
    }
}
