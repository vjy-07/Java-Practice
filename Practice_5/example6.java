import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for(int i=5;i<=n;i++){
		    if(i%5==0){
		        if(i%2==1){
		            count++;
		            if(count==1){
		                System.out.print(i);
		                System.out.print(", "+(i+1));
		            }
		            else{
    		            System.out.print(", "+i);
    		            System.out.print(", "+(i+1));
		            }
		        }
		        else{
		            
		            System.out.print(", "+i);
		            System.out.print(", "+(i+2));
		        }
		    }
		}
	}
}