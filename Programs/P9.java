public class P9 {
    static P9 obj = new P9();
    static void m1(){
        obj.m2();
        System.out.println("m1 static");
    }
    void m2(){
        System.out.println("m2 non static");
    }
    public static void main(String[] args) {
        obj.m2();
    }
}
