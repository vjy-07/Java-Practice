import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        for(int i=0;i<arr1.length;i++){
            int lc=0;
            for(int j=i;j>=0;j--){
                if(arr1[i].equals(arr1[j])){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<arr2.length;k++){
                    if(arr1[i].equals(arr2[k])){
                     System.out.print(arr1[i]+" ");
                    
                     arr2[k]="";
                        break;
                    }
                }
            }
            
        }
    }
}