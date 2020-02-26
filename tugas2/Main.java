package tugas2;

import tugas2.bangundatar.Persegi;
import tugas2.bangundatar.PersegiPanjang;
import tugas2.bangundatar.Segitiga;
import tugas2.bangunruang.*;

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
                        System.out.println("========================================");
                        System.out.println("Hitung Luas dan Keliling Segitiga");
                        System.out.print("Alas Segitiga = ");
                        Segitiga.alas = scanner.nextDouble();
                        System.out.print("Tinggi Segitiga = ");
                        Segitiga.tinggi = scanner.nextDouble();

                        Segitiga segitiga = new Segitiga();
                        segitiga.hitungKeliling();
                        segitiga.hitungLuas();

                        System.out.println("=========================================");
                        System.out.println("                HASIL                  ");
                        System.out.println("Keliling Segitiga       = " + segitiga.getKeliling());
                        System.out.println("Luas Segitiga = " + segitiga.getLuas());
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
                        System.out.println("Luas Persegi           = " + persegi.getLuasPersegi());
                        break;
                    case 3:
                        System.out.println("========================================");
                        System.out.println("Hitung Luas dan Keliling Persegi Panjang");
                        System.out.print("Panjang Persegi Panjang = ");
                        PersegiPanjang.panjang = scanner.nextDouble();
                        System.out.print("Lebar Persegi Panjang = ");
                        PersegiPanjang.lebar = scanner.nextDouble();

                        PersegiPanjang persegiPanjang = new PersegiPanjang();
                        persegiPanjang.hitungKeliling();
                        persegiPanjang.hitungLuas();

                        System.out.println("=========================================");
                        System.out.println("                HASIL                  ");
                        System.out.println("Keliling Persegi Panjang       = " + persegiPanjang.getKeliling());
                        System.out.println("Luas Persegi Panjang           = " + persegiPanjang.getLuas());
                        break;
                    default:
                        System.out.println("Maaf Anda Salah Input");
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
                            System.out.println("========================================");
                            System.out.println("Hitung Luas dan Volume Prisma Segitiga");
                            System.out.print("Alas Segitiga = ");
                            Segitiga.alas = scanner.nextDouble();
                            System.out.print("Tinggi Segitiga = ");
                            Segitiga.tinggi = scanner.nextDouble();
                            System.out.print("Tinggi  Prisma Segitiga = ");
                            PrismaSegitiga.tinggi = scanner.nextDouble();

                            Segitiga segitiga = new Segitiga();
                            segitiga.hitungLuas();
                            PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
                            prismaSegitiga.hitungLuas();
                            prismaSegitiga.hitungVolume();

                            System.out.println("=========================================");
                            System.out.println("                HASIL                  ");
                            System.out.println("Luas Permukaan Prisma Segitiga       = " + PrismaSegitiga.luas);
                            System.out.println("Volume Prisma Segitiga               = " + PrismaSegitiga.volume);
                        } else {
                            System.out.println("========================================");
                            System.out.println("Hitung Luas dan Volume Limas Segitiga");
                            System.out.print("Alas Segitiga = ");
                            Segitiga.alas = scanner.nextDouble();
                            System.out.print("Tinggi Segitiga = ");
                            Segitiga.tinggi = scanner.nextDouble();
                            System.out.print("Tinggi  Volume Segitiga = ");
                            PrismaSegitiga.tinggi = scanner.nextDouble();

                            Segitiga segitiga = new Segitiga();
                            segitiga.hitungLuas();
                            LimasSegitiga limasSegitiga = new LimasSegitiga();
                            limasSegitiga.hitungLuas();
                            limasSegitiga.hitungVolume();

                            System.out.println("=========================================");
                            System.out.println("                HASIL                  ");
                            System.out.println("Luas Permukaan Limas Segitiga       = " + LimasSegitiga.luasPermukaan);
                            System.out.println("Volume Limas Segitiga               = " + LimasSegitiga.volume);
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
                            System.out.print("Masukan Panjang Alas Persegi = ");
                            Persegi.sisi = scanner.nextInt();
                            System.out.print("Masukan Tinggi Limas Persegi = ");
                            LimasPersegi.tinggi = scanner.nextInt();
                            Persegi persegi = new Persegi();
                            persegi.hitungLuas();
                            LimasPersegi limasPersegi = new LimasPersegi();
                            limasPersegi.hitungLuas();
                            limasPersegi.hitungVolume();
                            System.out.println("=================================================");
                            System.out.println("                     HASIL                       ");
                            System.out.println("Luas Permukaan Kubus = " + LimasPersegi.luasPermukaan);
                            System.out.println("Volume Kubus         = " + LimasPersegi.volume);
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
                            System.out.println("========================================");
                            System.out.println("Hitung Luas dan Volume Balok");
                            System.out.print("Panjang Balok     = ");
                            PersegiPanjang.panjang = scanner.nextDouble();
                            System.out.print("Lebar Balok       = ");
                            PersegiPanjang.lebar = scanner.nextDouble();
                            System.out.print("Tinggi Balok       = ");
                            Balok.tinggi = scanner.nextDouble();

                            PersegiPanjang persegiPanjang = new PersegiPanjang();
                            persegiPanjang.hitungLuas();
                            Balok balok = new Balok();
                            balok.hitungLuas();
                            balok.hitungVolume();

                            System.out.println("=========================================");
                            System.out.println("                HASIL                  ");
                            System.out.println("Luas Permukaan Balok       = " + Balok.luasPermukaan);
                            System.out.println("Volume Balok               = " + Balok.volume);
                        } else {
                            System.out.println("========================================");
                            System.out.println("Hitung Luas dan Volume Limas Persegi Panjang");
                            System.out.print("Panjang Limas Persegi Panjang     = ");
                            PersegiPanjang.panjang = scanner.nextDouble();
                            System.out.print("Lebar Limas Persegi Panjang       = ");
                            PersegiPanjang.lebar = scanner.nextDouble();
                            System.out.print("Tinggi Limas Persegi Panjang       = ");
                            LimasPersegiPanjang.tinggi = scanner.nextDouble();

                            PersegiPanjang persegiPanjang = new PersegiPanjang();
                            persegiPanjang.hitungLuas();
                            LimasPersegiPanjang lp = new LimasPersegiPanjang();
                            lp.hitungLuas();
                            lp.hitungVolume();

                            System.out.println("===========================================");
                            System.out.println("                HASIL                  ");
                            System.out.println("Luas Permukaan Limas Persegi Panjang = " + LimasPersegiPanjang.luasPermukaan);
                            System.out.println("Volume Limas Persegi Panjang         = " + LimasPersegiPanjang.volume);
                        }
                        break;
                    default:
                        System.out.println("Maaf Anda Salah Input");
                }
            } else {
                System.out.println("Maaf Anda Salah Input");
            }
            System.out.println("=================================================");
            System.out.print("Back to Menu ? Y/N = ");
            back = scanner.next();
            back = back.toUpperCase();
        } while (back.charAt(0) == 'Y');
    }
}
