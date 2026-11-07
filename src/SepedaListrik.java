public class SepedaListrik extends KendaraanDasar {

    public SepedaListrik(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public double hitungTarif(double jarakKm) {
        return 4000 + (1500 * jarakKm);
    }

    @Override
    public String getJenis() {
        return "Sepeda Listrik";
    }
}