public class KonversiNumber {
    public static void main(String[] args) {
        //wedening casting
        // byte > sort > int > long > float > double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //Narrowing casting
        // double > float > long > int > char > sort > byte
        // contoh number overflow tidak terhingga
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;


    }
}
