package javatimur;

public abstract class BangunRuang3D implements bangunruang {
    String nama;

    public BangunRuang3D(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public abstract int hitungVolume();

    @Override
    public abstract int hitungLuasPermukaan();
}