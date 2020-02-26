package tugas2.bangundatar;

public class PersegiPanjang {
    public static double panjang, lebar;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    private double luas, keliling;

    public void hitungLuas() {
        luas = panjang * lebar;
    }

    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}
