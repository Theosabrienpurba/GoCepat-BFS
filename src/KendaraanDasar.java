public abstract class KendaraanDasar implements Kendaraan {

    private String merk;
    private String nomorPolisi;

    // Constructor
    public KendaraanDasar(String merk, String nomorPolisi) {
        this.merk = merk;
        this.nomorPolisi = nomorPolisi;
    }

    // Getter
    public String getMerk() {
        return merk;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }
}