import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        
        boolean isCapital = false;
        boolean isSmall = false;
        boolean isSpecial = false;
        boolean isDigit= false;
        boolean isExist =false;
        
        if(n2.length()==8){
            String newName = "";
            String newPass = "";
            newName = n1.toLowerCase();
            newPass = n2.toLowerCase();
            
            for(int i=0;i<n2.length();i++){
                char first = n2.charAt(0);
                char val = n2.charAt(i);
                if(first>='A' && first<='Z'){
                    isCapital=true;
                }
                if(val>='a' && val<='z'){
                    isSmall = true;
                }
                if(!(val>='a'&& val<='z') &&
                    !(val>='A' && val<='Z') &&
                    !(val>='0' && val<='9')){
                        isSpecial = true;
                }
                if(val>='0' && val<='9'){
                    isDigit=true;
                }
                if(newPass.contains(newName)){
                    isExist=true;
                }
            }
            if(isCapital && isSmall && isSpecial && isDigit && !isExist){
                System.out.print("Valid Password");
            }
            else{
                System.out.print("Not a Valid Password");
            }
        }
        else{
            System.out.print("Not a Valid Password");
        }
    
    }
}
