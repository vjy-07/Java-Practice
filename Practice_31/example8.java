import java.util.Scanner;
class A
{
    public static void main(String Game[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=1 || n>=11){
            System.out.print("Invalid Array Size");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            int temp= arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
