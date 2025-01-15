package src;

public class recursiveMethod {
  public static void main(String[] args) {
    System.out.println(factorialRcursive(5));
    System.out.println(factorialLoop(5));

    // contoh error penggunaan recursive
//    loop(10000);
  }

  static int factorialLoop(int value) {
    var result = 1;

    for(var counter = 1; counter <= value; counter++) {
      result *= counter;
    }

    return result;
  }

  static int factorialRcursive(int value) {
    if(value == 1) {
      return 1;
    }
    else {
      return value * factorialRcursive(value -1);
    }
  }
  // contoh error penggunaan recursive
//  static void loop(int value) {
//    if(value == 0) {
//      System.out.println("slesai");
//    } else {
//      System.out.println("loop " + value);
//      loop(value - 1);
//    }
//  }
}
