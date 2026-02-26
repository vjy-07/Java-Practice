public class P28 {
    int x;
    String s;

    P28(int x, String s){
        this.x=x;
        this.s=s;
    }
    public static void main(String[] args) {
        P28 obj = new P28(10,"vijay");
        System.out.println(obj.x);
        System.out.println(obj.s);
    }
}
