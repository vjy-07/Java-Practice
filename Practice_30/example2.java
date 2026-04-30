import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		if(k<=0){
		    System.out.print("InvaLid Key VaLue!");
		    return;
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        int rem = k-arr[i];
		        if(arr[j]==rem){
		            System.out.println(arr[i]+" "+arr[j]);
		            cnt++;
		        }
		    }
		}
		if(cnt==0){
		    System.out.print("Pairs are not available");
		}
	}
}
