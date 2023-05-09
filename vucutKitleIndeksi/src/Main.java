import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy uzunluğu istenir.
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double height = scanner.nextDouble();

        // Kullanıcıdan kilo istenir.
        System.out.println("Kilonuzu giriniz: ");
        double weight = scanner.nextDouble();

        // Vücut kitle indeksi hesaplanır.
        double result = weight / (height * height);

        // Vücut kitle indeksi ekrana yazdırılır.
        System.out.println("Vücut kitle indeksiniz: " + result);
    }
}
