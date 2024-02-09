/**
 * Kalkulator
 */
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1, angka2;

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");

        System.out.println("Masukkan pilihan (1/2)");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1") || pilihan.equals("2")) {
            System.out.println("Masukkan bilangan pertama: ");
            angka1 = scanner.nextInt();
            System.out.println("Masukkan bilangan kedua: ");
            angka2 = scanner.nextInt();

            if (pilihan.equals("1")) {
                System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
            } else {
                System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));

            }
        }else{
            System.out.println("Pilihan invalid");
        }
    }
}