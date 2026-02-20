import java.util.Scanner;
public class example14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=5;i<=n;i++){
            if(i%5==0){
                if(i%2==1){
                    System.out.print(i+" ");
                    System.out.print(i+1+" ");
                }
                else{
                    System.out.print(i+" ");
                    System.out.print(i+2+" ");
                }
            }
        }
    }
}
