import java.util.*;
class Main
{
    static String toStr(int n){
        String res="";
        while(n>0){
            int r=n%10;
            res=r+res;
            n/=10;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();
        
        for(int i=n1-1;i>0;i--){
            if(toStr(i).contains(toStr(n2))){
                System.out.print(i);
                return;
            }
        }
    }

}
