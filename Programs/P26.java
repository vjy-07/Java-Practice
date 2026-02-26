public class P26 {
    P26(int a){
        System.out.println("constructor with parameters");
    }
    P26(){
        System.out.println("no argument constructor");
    }
    public static void main(String[] args) {
        P26 obj = new P26(10);
        P26 obj1 = new P26();
    }
}
