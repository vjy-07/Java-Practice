import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        for(int i=0;i<a;i++){
            count++;
            if(count==1){
                System.out.print("A,B");
            }
            else{
                System.out.print(",A,B");
            }
        }
    }
}