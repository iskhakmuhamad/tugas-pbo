package tugas2.bangunruang;

import tugas2.bangundatar.SegitigaSSisi;

import static java.lang.StrictMath.sqrt;

public class LimasSegitigaSSisi extends SegitigaSSisi {

    public static double luasPermukaan, volume, tinggi;

    @Override
    public void hitungLuas() {
        double sMiring1, sMiring2, sMiring3;
        sMiring1 = sqrt(alas / 2 * alas / 2 + tinggi * tinggi);
        sMiring2 = sqrt(SegitigaSSisi.tinggi / 2 * SegitigaSSisi.tinggi / 2 + tinggi * tinggi);
        sMiring3 = sqrt(SegitigaSSisi.ssmiring / 2 * SegitigaSSisi.ssmiring / 2 + tinggi * tinggi);
        luasPermukaan = super.getLuas() + sMiring1 * sMiring1 / 2 + sMiring2 * sMiring2 / 2 + sMiring3 * sMiring3 / 2;
    }

    public void hitungVolume() {
        volume = super.getLuas() * tinggi / 6;
    }
}
