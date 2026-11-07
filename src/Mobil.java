public class Mobil extends KendaraanDasar {

    public Mobil(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public double hitungTarif(double jarakKm) {
        return 10000 + (4000 * jarakKm);
    }

    @Override
    public String getJenis() {
        return "Mobil";
    }
}