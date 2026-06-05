import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        for(int i=0;i<arr1.length;i++){
            int oc=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[i].equals(arr1[j])){
                    oc++;
                }
            }
            if(oc==1){
                for(int k=0;k<arr2.length;k++){
                    int oc1=0;
                    for(int l=0;l<arr2.length;l++){
                        if(arr2[k].equals(arr2[l])){
                            oc1++;
                        }
                    }
                    if(oc1==1){
                        if(arr1[i].equals(arr2[k])){
                            System.out.print(arr1[i]+" ");
                        }
                    }
                    
                }
            }
            
        }
    }
}