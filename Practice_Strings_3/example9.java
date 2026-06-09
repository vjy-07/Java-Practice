import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            
            if(cnt%3==0){
                System.out.println();
            }
            cnt++;
            System.out.print(s1.charAt(i));
            
        }
    }
}