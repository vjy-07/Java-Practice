import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);
        int index = s.indexOf(ch);
        while(index!=-1){
            System.out.print(index+" ");
            index = s.indexOf(ch,index+1);
        }
    }
}