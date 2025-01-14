package src;

public class switchStatementLamda {
  public static void main(String[] args) {
    var nilai = 100;

    String ucapan = switch (nilai) {
      case 70:
        yield "Lamda1";
      case 80:
        yield "Lamda2";
      case 90, 100:
        yield "Lamda3";
      default:
        yield "ANDA BELUM LULUS SILAHKAN COBA LG !";
    };

    System.out.println(ucapan);
  }
}
