public class MobilListrik extends KendaraanDasar {

    public MobilListrik(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public double hitungTarif(double jarakKm) {
        return 12000 + (2500 * jarakKm);
    }

    @Override
    public String getJenis() {
        return "Mobil Listrik";
    }
}