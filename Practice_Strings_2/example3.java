import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String arr[]=s.split(" ");
        int maxx=0;
        String val ="";
        for(int i=0;i<arr.length;i++){
            int lc=0,oc=0;
            for(int j=i;j>=0;j--){
                if(arr[j].equals(arr[i])){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<arr.length;k++){
                    if(arr[k].equals(arr[i])){
                        oc++;
                    }
                }
                if(oc>maxx){
                    maxx=oc;
                    val = arr[i];
                }
            }
        }
        System.out.println(val +" -> "+maxx);
        int maxCnt=0;
        char chh = ' ';
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            int lc1 =0,oc1=0;
            for(int j=i;j>=0;j--){
                char ch2 = s.charAt(j);
                if(ch1==ch2){
                    lc1++;
                }
            }
            if(lc1==1){
                for(int k=0;k<s.length();k++){
                    char ch3 = s.charAt(k);
                    if(ch1==ch3){
                        oc1++;
                    }
                }
                if(oc1>maxCnt){
                    maxCnt=oc1;
                    chh=ch1;
                }
            }
        }
        System.out.print(chh+" -> "+maxCnt);
    }
}