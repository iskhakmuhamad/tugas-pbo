package tugas2.bangunruang;

import tugas2.bangundatar.Persegi;

public class Kubus extends Persegi {
    public static double volumeKubus;
    public static double luasKubus;

    public void hitungVolume(){
        volumeKubus = Persegi.luasPersegi * Persegi.sisi ;
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasKubus = Persegi.luasPersegi * 6 ;
    }
}
