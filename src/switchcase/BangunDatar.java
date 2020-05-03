package switchcase;
import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Program Menghitung Luas");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Luas Segitiga");
        System.out.println("1. Luas Lingkaran");
        System.out.println("");
        System.out.println("Ketik angka untuj memilih");
        System.out.print("Pilih Luas : ");
        int pilih = input.nextInt();
        System.out.println("==========================");



        switch (pilih) {
            case 1:
                System.out.print("Masukan Panjang : ");
                int d = input.nextInt();
                System.out.print("Masukan Lebar : ");
                int e = input.nextInt();
                int z = d * e;
                System.out.println("");
                System.out.println("==========================");
                System.out.println("Luas Persegi panjang = " + z);
                break;

            case 2:
                System.out.print("Masukan Alas : ");
                double f = input.nextInt();
                System.out.print("Masukan Tinggi : ");
                double g = input.nextInt();
                double y = (f * g) / 2;
                System.out.println("==========================");
                System.out.println("");
                System.out.println("Luas Segitiga = " + y);
                break;

            case 3:
                System.out.print("Masukan jari-jari : ");
                f = input.nextInt();
                y = f * f * 22 / 7;
                System.out.println("");
                System.out.println("==========================");
                System.out.println("Luas Lingkaran = " + y);
                break;

        }
    }
}