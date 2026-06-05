import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1+" "+s2;
        String arr[] = s3.split(" ");
        for(int i=0;i<arr.length;i++){
            int lc=0;
            for(int j=i;j>=0;j--){
                if(arr[i].equals(arr[j])){
                    lc++;
                }
            }
            if(lc==1){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}