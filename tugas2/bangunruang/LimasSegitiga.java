package tugas2.bangunruang;

import tugas2.bangundatar.Segitiga;

import static java.lang.StrictMath.sqrt;

public class LimasSegitiga extends Segitiga {

    public static double luasPermukaan, volume, tinggi;

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        double sMiring1, sMiring2, sMiring3;
        sMiring1 = sqrt(alas / 2 * alas / 2 + tinggi * tinggi);
        sMiring2 = sqrt(Segitiga.tinggi / 2 * Segitiga.tinggi / 2 + tinggi * tinggi);
        sMiring3 = sqrt(Segitiga.ssmiring / 2 * Segitiga.ssmiring / 2 + tinggi * tinggi);
        luasPermukaan = super.getLuas() + sMiring1 * sMiring1 / 2 + sMiring2 * sMiring2 / 2 + sMiring3 * sMiring3 / 2;
    }

    public void hitungVolume() {
        super.hitungLuas();
        volume = super.getLuas() * tinggi / 6;
    }
}
