package src;

public class variableArgument {
  public static void main(String[] args) {
    int[] values = {80,80,80,80,80};

    sayCongrats("Budi", values);

    sayCongrats("Eko",80,50,50,50,80);
  }
  // contoh penggunaan variable argument jika tidak menggunakan variable argument
  // static void sayCongrats(String name, int[] values) {
  static void sayCongrats(String name, int... values) {
    var total = 0;
        for (var value : values) {
          total += value;
        }

        var finalTotal = total /values.length;

        if (finalTotal >= 75){
          System.out.println(name + " Congrats " + finalTotal + " LULUS ");
        } else {
          System.out.println(name + " MAAF " + finalTotal + " TIDAK LULUS ");
        }
  }
}
