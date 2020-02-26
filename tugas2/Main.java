package tugas2;

import tugas2.bangundatar.Persegi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilBangun;
        System.out.println("Program Hitung Bangun");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.print("Pilih = ");

        pilBangun = scanner.nextInt();

        if (pilBangun == 1) {
            System.out.println("Pilih Bangun Datar");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.print("Pilih = ");
            pilBangun = scanner.nextInt();
            switch (pilBangun) {
                case 1:
                    System.out.println("Hitung Luas dan Keliling Segitiga");
                    System.out.print("Masukan Alas Segitiga = ");
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println("Hitug Luas dan Keliling Persegi");
                    System.out.print("Masukan Panjang Sisi Persegi = ");
                    Persegi.sisi = scanner.nextInt();
                    Persegi persegi = new Persegi();
                    persegi.hitungKeliling();
                    System.out.println("=========================================");
                    System.out.println("                HASIL                  ");
                    System.out.println("Keliling Persegi       = " + Persegi.kelilingPersegi);
                    persegi.hitungLuas();
                    System.out.println("Luas Permukaan Persegi = " + Persegi.luasPersegi);
                    System.out.println("=========================================");
                    break;
                case 3:
            }
        }
    }
}
