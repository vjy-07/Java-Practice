import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.compareTo(s2)>0){
            String temp = s1;
            s1=s2;
            s2 =temp;
        }
        System.out.println(s1);
    }
}