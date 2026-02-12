public class P13 {
    void m1(){
        System.out.println("non-static method");
    }
    static void m2(P13 obj1){
        obj1.m1();
        System.out.println("static method");
    }
    public static void main(String[] args) {
        P13 obj = new P13();
        m2(obj);
    }
}
