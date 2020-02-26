package tugas2.bangunruang;

import tugas2.bangundatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
    public static double volume,luasPermukaan,tinggi;

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasPermukaan = 2 * (PersegiPanjang.lebar * tinggi + PersegiPanjang.panjang *tinggi + super.getLuas());
    }

    public void hitungVolume(){
        super.hitungLuas();
        volume = super.getLuas() * tinggi;
    }

}
