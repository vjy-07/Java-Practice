public class P10 {
    static P10 obj = new P10();
    static void m1(){
        obj.m2();
        System.out.println("m1 static");
    }
    void m2(){
        System.out.println("m2 non static");
    }
    public static void main(String[] args) {
        m1();
        obj.m2();
    }
}
