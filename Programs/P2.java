class P2{
    void m1(int a, char ch){
        System.out.println("value of int is: "+a+" value of char is: "+ch);
    }
    static void m2(){
        System.out.println("inside m2");
        P2 obj = new P2();
        m3(obj);
    }
    static void m3(P2 obj1){
        System.out.println("inside m3");
        obj1.m1(10,'@');
    }
    public static void main(String[] args){
        m2();
    }
}