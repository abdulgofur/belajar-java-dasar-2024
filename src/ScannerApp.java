import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama :");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        int age = scanner.nextInt();

        // scanner.nextInt();
        // scanner.nextBoolean();
        // scanner.nextDouble();

        System.out.println("Hallo " + name + " Umur " + age);
    }
}
