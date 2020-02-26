package tugas2;

import tugas2.bangundatar.Persegi;
import tugas2.bangunruang.Kubus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilDimensi, pilBangun;
        String back;
        do {

            System.out.println("Program Hitung Bangun");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Pilih = ");

            pilDimensi = scanner.nextInt();

            if (pilDimensi == 1) {
                System.out.println("--------------------------------------------------------------");
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
                        System.out.println("Keliling Persegi       = " + persegi.getKelilingPersegi());
                        persegi.hitungLuas();
                        System.out.println("Luas Permukaan Persegi = " + persegi.getLuasPersegi());
                        System.out.println("=========================================");
                        break;
                    case 3:
                        break;
                }
            } else if (pilDimensi == 2) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Pilih Bangun Dasar Pembentuk Bangun Ruang");
                System.out.println("1. Segitiga");
                System.out.println("2. Persegi");
                System.out.println("3. Persegi Panjang");
                System.out.print("Pilih = ");
                pilBangun = scanner.nextInt();
                switch (pilBangun) {
                    case 1:
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Pilih Bangun Ruang Dari Segitiga");
                        System.out.println("1. Prisma Segitiga");
                        System.out.println("2. Limas Segitiga");
                        System.out.print("Pilih = ");
                        pilBangun = scanner.nextInt();
                        if (pilBangun == 1) {

                        } else {

                        }
                        break;
                    case 2:
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Pilih Bangun Ruang Dari Persegi");
                        System.out.println("1. Kubus");
                        System.out.println("2. Limas Kubus");
                        System.out.print("Pilih = ");
                        pilBangun = scanner.nextInt();
                        if (pilBangun == 1) {
                            System.out.print("Masukan Panjang Sisi Kubus = ");
                            Persegi.sisi = scanner.nextInt();
                            Persegi persegi = new Persegi();
                            persegi.hitungLuas();
                            Kubus kubus = new Kubus();
                            kubus.hitungLuas();
                            kubus.hitungVolume();
                            System.out.println("=================================================");
                            System.out.println("                     HASIL                       ");
                            System.out.println("Luas Permukaan Kubus = " + Kubus.luasKubus);
                            System.out.println("Volume Kubus         = " + Kubus.volumeKubus);
                        } else {

                        }
                        break;
                    case 3:
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Pilih Bangun Ruang Dari Persegi Panjang");
                        System.out.println("1. Balok");
                        System.out.println("2. Limas Balok");
                        System.out.print("Pilih = ");
                        pilBangun = scanner.nextInt();
                        if (pilBangun == 1) {

                        } else {

                        }
                        break;
                }
            } else {

            }
            System.out.print("Back to Menu ? Y/N = ");
            back = scanner.next();
            back = back.toUpperCase();
        } while (back.charAt(0) == 'Y');
    }
}
