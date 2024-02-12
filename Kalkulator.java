/**
 * Kalkulator
 */
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil1, bil2;

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Hasil Bagi");

        System.out.println("Masukkan pilihan (1/2/3/4/6) : ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3") || pilihan.equals("4")) {
            System.out.println("Masukkan bil pertama: ");
            bil1 = scanner.nextInt();
            System.out.println("Masukkan bil kedua: ");
            bil2 = scanner.nextInt();

            if (pilihan.equals("1")) {
                System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
            } else if(pilihan.equals("2")) {
                System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
            } else if(pilihan.equals("3")) {
                System.out.println(bil1 + "x" + bil2 + " = " + (bil1 * bil2));
            } else if(pilihan.equals("4")) {
                System.out.println(bil1 + "/" + bil2 + " = " + (bil1 / bil2));
            }
        }else{
            System.out.println("Pilihan invalid");
        }
    }
}