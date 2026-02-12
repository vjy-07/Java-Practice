class P4{
    static void m1(){
        System.out.println("method one");
    }
    static void m2(){
        System.out.println("method two");
    }
    
    public static void main(String[] args) {
        m1();
        m2();
        m1();
    }
}