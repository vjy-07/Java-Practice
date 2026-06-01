import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int largest = 0;
        String val = "";
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
            }
            if(oc==1 && arr[i].length()>largest){
                largest=arr[i].length();
                val=arr[i];
            }
        }
        System.out.print(val);
    }
}