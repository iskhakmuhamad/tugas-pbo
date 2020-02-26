package tugas2.bangundatar;

import static java.lang.Math.sqrt;

public class Segitiga {
    public static double alas, tinggi;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    private double luas, keliling;

    public void hitungLuas() {
        luas = alas * tinggi / 2;
    }

    public void hitungKeliling() {
        keliling = alas + tinggi + (sqrt(alas * alas + tinggi * tinggi));
    }
}
