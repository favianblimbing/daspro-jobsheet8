import java.util.Scanner;

public class Triangle13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt(); // input nilai n
        int i = 1; // inisialisasi variabel i untuk loop baris

        // loop untuk mencetak segitiga bintang
        while (i <= n) {
            int j = 0;
            while (j < i) { // loop untuk mencetak bintang pada setiap baris
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Segitiga terbalik
        i = n;
        while (i >= 1) {// loop untuk mencetak segitiga bintang terbalik
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        sc.close(); // menutup scanner

    }
}