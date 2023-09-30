package javatimur;

public class Kubus extends BangunRuang3D {
    int sisi;

    public Kubus(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public int hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
