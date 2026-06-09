import java.util.Scanner;
class A{
    static boolean found(int arr[][], int k, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k =sc.nextInt();
        if(found(arr,k,r,c)){
            System.out.print("found");
        }
        else{
            System.out.print("not found");
        }
    }
}