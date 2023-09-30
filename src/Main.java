import java.util.Scanner;
import javatimur.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisiKubus = (int) scanner.nextDouble();
        Kubus kubus = new Kubus("Kubus", sisiKubus);

        // Membuat objek Tabung
        System.out.print("Masukkan jari-jari tabung: ");
        int jariJariTabung = (int) scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        int tinggiTabung = (int) scanner.nextDouble();
        Tabung tabung = new Tabung("Tabung", jariJariTabung, tinggiTabung);

        // Menggunakan objek dengan polimorfisme
        BangunRuang3D[] bangunRuangArray = {kubus, tabung};
        for (BangunRuang3D bangunRuang : bangunRuangArray) {
            System.out.println("Nama: " + bangunRuang.getNama());
            System.out.println("Volume: " + bangunRuang.hitungVolume());
            System.out.println("Luas Permukaan: " + bangunRuang.hitungLuasPermukaan());
            System.out.println("------------------------------------------------");
        }
    }
}
