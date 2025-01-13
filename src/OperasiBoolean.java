package src;

public class OperasiBoolean {
    public static void main(String[] args) {

        var nilai = 90;
        var absen = 70;
        var uas = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilai >= 75;
        var lulusUas = uas >= 75;

        System.out.println(lulusAbsen);
        System.out.println(lulusNilaiAkhir);
        System.out.println(lulusUas);

    }
}
