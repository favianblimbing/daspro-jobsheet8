import java.util.Scanner;

public class Rectangle13 {

    public static void main(String[] args) {

        // membuat objek Scanner untuk input
        Scanner sc = new Scanner(System.in);

        // meminta input jumlah baris dan kolom dari pengguna
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) { // outer loop: baris
            for (int j = 1; j <= kolom; j++) { // inner loop: kolom
                System.out.print("#");
            }
            System.out.println(); // pindah baris
        }

        sc.close(); // menutup scanner
    }
}