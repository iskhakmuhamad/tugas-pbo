package tugas2.bangunruang;

import tugas2.bangundatar.Persegi;

public class LimasPersegi extends Persegi {
    public static double luasPermukaan,volume,tinggi;

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasPermukaan = super.getLuasPersegi() + (4 * Persegi.sisi * tinggi / 2);
    }

    public void hitungVolume(){
        super.hitungLuas();
        volume = super.getLuasPersegi() * tinggi /3;
    }
}
