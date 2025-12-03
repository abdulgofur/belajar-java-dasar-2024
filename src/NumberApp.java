public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        Byte byteValue = shortValue.byteValue();

        System.out.println(intValue + " intValue");
        System.out.println(longValue + " longValue");
        System.out.println(doubleValue + " doubleValue");
        System.out.println(shortValue + " shortValue");

        String contoh = "100.101";
        Double contohInt =  Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
