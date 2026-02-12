public class P8 {
    void m1(){
        System.out.println("hi");
    }
    void m2(){
        System.out.println("hello");
        m1();
        System.out.println("bye");
    }
    public static void main(String[] args) {
        P8 obj = new P8();
        obj.m2();
    }
}
