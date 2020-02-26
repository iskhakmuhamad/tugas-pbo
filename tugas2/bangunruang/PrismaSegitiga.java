package tugas2.bangunruang;

import tugas2.bangundatar.Segitiga;

public class PrismaSegitiga extends Segitiga {
    public static double volume, tinggi;
    public static double luas;

    public void hitungVolume() {
        volume = super.getLuas() * tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = super.getLuas() * 2 + super.getKeliling() * tinggi;
    }
}
