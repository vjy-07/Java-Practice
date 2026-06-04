//sort words based on length
import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String a[]=s.split(" ");
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j].length()>a[j+1].length()){
                    String temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        System.out.print(Arrays.toString(a));
    }
}