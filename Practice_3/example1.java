import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float start = sc.nextFloat();
        float end = sc.nextFloat();
        int count=0;
        for(float i = start; i<end; i=i+0.2f){
            count++;
            if(count==1){
                System.out.printf("%.1f^2",i);
            }
            else{
                System.out.printf(", %.1f^2",i);
            }
        }
        if(count>0){
            System.out.print(".");
        }
    }
}