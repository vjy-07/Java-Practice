import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            int lc=0,oc=0;
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            for(int j=i;j>=0;j--){
                char ch1 = s.charAt(j);
                if(ch == ch1){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<s.length();k++){
                    char ch2=s.charAt(k);
                    if(ch == ch2){
                        oc++;
                    }
                }
                System.out.println(ch+" -> "+oc);
            }
        }
    }
}