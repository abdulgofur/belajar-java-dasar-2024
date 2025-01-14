package src;

public class forEachh {
  public static void main(String[] args) {
    String[] names = {
        "Eko","Kurniawan","khanedy",
        "abdul","Gofur"
    };
    sayHello(names);
  }

  static void sayHello(String[] names) {
    for (String name : names) {
      System.out.println("Hello World " + name);
    }
  }

}
