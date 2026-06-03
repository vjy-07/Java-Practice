import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String arr[]=s.split(" ");
        
        int freq[] = new int[arr.length];
        int f=0;
        String val[] = new String[arr.length];
        int v=0;
        for(int i=0;i<arr.length;i++){
            int lc=0,oc=0;
            for(int j=i;j>=0;j--){
                if(arr[i].equals(arr[j])){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<arr.length;k++){
                    if(arr[k].equals(arr[i])){
                        oc++;
                    }
                }
                freq[f]=oc;
                val[v]=arr[i];
                f++;
                v++;
            }
        }
        for(int i=0;i<f-1;i++){
            for(int j=i+1;j<f;j++){
                if(freq[i]<freq[j]){
                    int temp=freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp;
                    
                    String temp1 = val[i];
                    val[i]=val[j];
                    val[j]=temp1;
                }
            }
        }
        for(int i=0;i<v;i++){
            System.out.println(val[i]+" -> "+ freq[i]);
        }
    }
}