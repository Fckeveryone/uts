package javatimur;

public class Tabung extends BangunRuang3D {
    int jariJari;
    int tinggi;

    public Tabung(String nama, int jariJari, int tinggi) {
        super(nama);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public int hitungVolume() {
        return (int) (Math.PI * jariJari * jariJari * tinggi);
    }

    @Override
    public int hitungLuasPermukaan() {
        return (int) (2 * Math.PI * jariJari * (jariJari + tinggi));
    }
}