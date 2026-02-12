class P5{
    static void m1(){
        System.out.println("hi");
    }
    static void m2(){
        m1();
        System.out.println("hello");
        m1();
    }

    public static void main(String[] args) {
        m2();
    }
}