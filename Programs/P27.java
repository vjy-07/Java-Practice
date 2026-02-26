import java.util.Scanner;
public class P27 {
    static Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    P27(){
        System.out.println("constructor called after non static variables loaded");
    }
    public static void main(String[] args) {
        P27 obj = new P27();
    }
}
