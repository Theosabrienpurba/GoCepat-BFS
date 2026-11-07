public enum JenisKendaraan {

    Motor(5000, 2000),
    Mobil(10000, 4000),
    MobilListrik(12000, 2500);

    private double tarifDasar;
    private double tarifPerKm;

    JenisKendaraan(double tarifDasar, double tarifPerKm) {
        this.tarifDasar = tarifDasar;
        this.tarifPerKm = tarifPerKm;
    }

    public double hitungTarif(double jarakKm) {
        return tarifDasar + (tarifPerKm * jarakKm);
    }
}