import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char chArr[] = new char[s.length()];
        int freq[] = new int[s.length()];
        int t=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int lc=0,oc=0;
            for(int j=i;j>=0;j--){
                char ch1= s.charAt(j);
                if(ch==ch1){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<s.length();k++){
                    char ch2=s.charAt(k);
                    if(ch==ch2){
                        oc++;
                    }
                }
                chArr[t]=ch;
                freq[t]=oc;
                t++;
            }
        }
        for(int i=0;i<t-1;i++){
            for(int j=i+1;j<t;j++){
                if(freq[i]<freq[j]){
                    int temp=freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp;
                    
                    char tempCh = chArr[i];
                    chArr[i]=chArr[j];
                    chArr[j]=tempCh;
                }
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(chArr[i]+" -> "+freq[i]);
        }
    }
}