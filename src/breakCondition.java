package src;

public class breakCondition {
  public static void main(String[] args) {
    var count = 1;
    while (true) {
      System.out.println("Count: " + count);
      count++;

      if (count > 10) {
        break;
      }
    }

    System.out.println("Gagal");
  }
}
