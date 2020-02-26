package tugas2.bangunruang;

import tugas2.bangundatar.Persegi;
import tugas2.bangundatar.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {
    public static double luasPermukaan, volume, tinggi;

    @Override
    public void hitungLuas() {
        luasPermukaan = super.getLuas() + (PersegiPanjang.panjang * tinggi) + (PersegiPanjang.lebar * tinggi);
    }

    public void hitungVolume() {
        volume = super.getLuas() * tinggi / 3;
    }
}
