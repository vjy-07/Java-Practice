import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1+" "+s2;
        String arr[] = s3.split(" ");
        String res[] = new String[arr.length];
        int r=0;
        for(int i=0;i<arr.length;i++){
            int lc=0;
            for(int j=i;j>=0;j--){
                if(arr[i].equals(arr[j])){
                    lc++;
                }
            }
            if(lc==1){
                res[r++]=arr[i];
            }
        }
        for(int i=0;i<r-1;i++){
            for(int j=0;j<r-i-1;j++){
                if(res[j].compareTo(res[j+1])>0){
                    String temp= res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                }
            }
        }
        for(int i=0;i<r;i++){
            System.out.print(res[i]+" ");
        }
    }
}