import java.util.*;
public class example2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int odd[]=new int[n];
		int oddEl[]=new int[n];
		int o=0;
		int even[]=new int[n];
		int evenEl[]=new int[n];
		int e=0;
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    int lc=0,oc=0;
		    for(int j=i;j>=0;j--){
		        if(arr[i]==arr[j]){
		            lc++;
		        }
		    }
		    if(lc==1){
		        for(int k=0;k<n;k++){
		            if(arr[k]==arr[i]){
		                oc++;
		            }
		        }
		        if(oc%2!=0){
		            odd[o]=oc;
		            oddEl[o]=arr[i];
		            o++;
		        }
		        else{
		            even[e]=oc;
		            evenEl[e]=arr[i];
		            e++;
		        }
		    }
		}
		for(int i=0;i<o-1;i++){
		    for(int j=i+1;j<o;j++){
		        if(odd[i]<odd[j]){
		            int temp=odd[i];
		            odd[i]=odd[j];
		            odd[j]=temp;
		            
		            int temp1=oddEl[i];
		            oddEl[i]=oddEl[j];
		            oddEl[j]=temp1;
		        }
		    }
		}
		for(int i=0;i<e-1;i++){
		    for(int j=i+1;j<e;j++){
		        if(even[i]>even[j]){
		            int temp=even[i];
		            even[i]=even[j];
		            even[j]=temp;
		            
		            int temp1=evenEl[i];
		            evenEl[i]=evenEl[j];
		            evenEl[j]=temp1;
		        }
		    }
		}
		for(int i=0;i<o;i++){
		    System.out.println(oddEl[i]+" - "+odd[i]);
		}
		for(int i=0;i<e;i++){
		    System.out.println(evenEl[i]+" - "+even[i]);
		}
	}
}