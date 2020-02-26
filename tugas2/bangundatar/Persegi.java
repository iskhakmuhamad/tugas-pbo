package tugas2.bangundatar;

public class Persegi {

    public static double sisi;

    public double getLuasPersegi() {
        return luasPersegi;
    }

    public double getKelilingPersegi() {
        return kelilingPersegi;
    }

    private double luasPersegi,kelilingPersegi;

    public void hitungLuas(){
        luasPersegi = sisi * sisi;
    }

    public void hitungKeliling(){
        kelilingPersegi = sisi * 4;
    }
}
