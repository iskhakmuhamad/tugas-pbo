package tugas2.bangunruang;

import tugas2.bangundatar.Persegi;

public class Kubus extends Persegi {
    public static double volumeKubus;
    public static double luasKubus;

    public void hitungVolume(){
        super.hitungLuas();
        volumeKubus = super.getLuasPersegi() * Persegi.sisi ;
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasKubus = super.getLuasPersegi() * 6 ;
    }
}
