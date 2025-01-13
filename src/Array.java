package src;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{
            10, 90, 80, 72, 28
        };

        String[] array2 = {"10", "90", "80", "72", "28"};

        int[] array3 = new int[]{10, 90, 80, 72, 28};

        long[] array4 = new long[]{10, 90, 80, 72, 28};

        System.out.println(array.length);

        String[][] members = {
                {"10", "90", "80", "72", "28"},
                {"10", "90", "80", "71", "29"},
                {"10", "90", "80", "70", "30"},
        };

        System.out.println(members[1][4]);

        String[] members2 = {"10", "90", "80", "72", "28"};
    }
}
