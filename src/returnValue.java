package src;

public class returnValue {
  public static void main(String[] args) {

    var d = sum(100, 100, 100);
    System.out.println(d);

    System.out.println(hitung(100, "+",100));
    System.out.println(hitung(100, "*",100));
    System.out.println(hitung(100, "/",100));
    System.out.println(hitung(200, "-",100));

  }

  static int sum(int a, int b, int c) {
    return a + b + c;
  }

  static int hitung(int a, String b, int c) {
    switch (b) {
      case "+":
        return a + c;
      case "*":
        return a * c;
      case "/":
        return a / c;
      case "-": 
        return a - c;
      default:
        return 0;
    }
  }
}
