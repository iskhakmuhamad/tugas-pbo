package tugas2.bangunruang;

import tugas2.bangundatar.Persegi;

public class Kubus extends Persegi {
    public static double volumeKubus;
    public static double luasKubus;

    public void hitungVolume(){
        volumeKubus = super.getLuasPersegi() * Persegi.sisi ;
    }

    @Override
    public void hitungLuas() {
        luasKubus = super.getLuasPersegi() * 6 ;
    }
}
