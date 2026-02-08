import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            int count=0;
            for(int i=a;i>=b;i--){
                count++;
                if(count==1){
                    System.out.print(i+"@"+(i-1));
                }
                else{
                    System.out.print(","+i+"@"+(i-1));
                }
            }
        }
        else{
            int count=0;
            for(int i=a;i<=b;i++){
                count++;
                if(count==1){
                    System.out.print(i+"@"+(i+1));
                }
                else{
                    System.out.print(","+i+"@"+(i+1));
                }
            }
        }
    }
}