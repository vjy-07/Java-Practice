import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start>end){
            System.out.print("INVALID RANGE");
        }
        else{
            for(int i=start; i<=end; i++){
                if(i%2==1){
                    System.out.print(i+" ");
                }
            }
        }
    }
}