import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Inputs");
        }
        else if(n1<=0) System.out.print("Given Row is Invalid.");
        else if(n2<=0) System.out.print("Invalid STarTing value.");
        else if(n2<2 || n2>10) System.out.print("Given Starting is Invalid");
        else{
            for(int i=1;i<=2*n1;i++){
                if(i<=n1){
                    for(int j=1;j<=i;j++){
                        System.out.print(n2+ " ");
                    }
                    ++n2;
                    System.out.println();
                }
                else{
                    --n2;
                    for(int j=1;j<=2*n1-i+1;j++){
                        System.out.print(n2+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
