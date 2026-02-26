class Main {
    static Main m1(){
      Main obj = new Main();
      return obj;
      
    }
    void m2(){
      System.out.println("m2");
    }
    public static void main(String[] args) {
      Main obj1 = m1();
      obj1.m2();
    }
}