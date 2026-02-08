import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i=1;i<=a;i++){
            if(i%3!=0){
                count++;
                if(count==1){
                    System.out.print(i);   
                }
                else{
                    System.out.print(", "+i);
                }
            }
            else{
                System.out.print(", factor of three");
            }
        }
    }
}