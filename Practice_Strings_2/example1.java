import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for(int i=0;i<arr.length;i++){
            int lc=0,oc=0;
            for(int j=i;j>=0;j--){
                if(arr[i].equals(arr[j])){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<arr.length;k++){
                    if(arr[i].equals(arr[k])){
                        oc++;
                    }
                }
                System.out.println(arr[i]+" -> "+oc);
            }
        }
    }
}