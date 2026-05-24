import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);
        System.out.print(s.indexOf(ch));
    }
}