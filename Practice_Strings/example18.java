import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1 = new String(sc.next());
        String s2 = new String(sc.next());
        System.out.print(s1.equalsIgnoreCase(s2));
    }
}