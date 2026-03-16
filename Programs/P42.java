class A{
    A(){
        System.out.println("from A");
    }
}
class B extends A{
    B(){
        System.out.println("from B");
    }
    public static void main(String[] args){
        B obj = new B();
    }
}
