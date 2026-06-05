import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.print(arr1[i]+" ");
                    
                    arr2[j]="";
                    break;
                }
            }
        }
    }
}