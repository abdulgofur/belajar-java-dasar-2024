package src;

public class methodOverLoading {
  public static void main(String[] args) {
    method1();
    method1("Abdul");
    method1("Abdul",30);
  }
  static  void method1(){
    System.out.println("method1");
  }

  static  void method1(String name){
    System.out.println("method1 " + name);
  }

  static  void method1(String name,int age){
    System.out.println("method1 " + name + age);
  }
}
