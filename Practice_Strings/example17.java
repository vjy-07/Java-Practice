import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1 = new String("Vijay"); // heap memory
        String s2 = new String("Vijay"); // heap memory
        String s3 = "Vijay"; // string pool
        String s4 = "Vijay"; // string pool
        System.out.println(s3==s4);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
    }
}