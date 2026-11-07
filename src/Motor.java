public class Motor extends KendaraanDasar {

    public Motor(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public double hitungTarif(double jarakKm) {
        return 5000 + (2000 * jarakKm);
    }

    @Override
    public String getJenis() {
        return "Motor";
    }
}