public class Trip {

    private Driver driver;
    private Penumpang penumpang;
    private Kendaraan kendaraan;
    private double jarakKm;
    private MetodePembayaran pembayaran;

    // Constructor
    public Trip(Driver driver, Penumpang penumpang,
                Kendaraan kendaraan, double jarakKm,
                MetodePembayaran pembayaran) {

        this.driver = driver;
        this.penumpang = penumpang;
        this.kendaraan = kendaraan;
        this.jarakKm = jarakKm;
        this.pembayaran = pembayaran;
    }

    // Menghitung total pembayaran
    public double hitungTotal() {
        return kendaraan.hitungTarif(jarakKm)
                + pembayaran.getBiayaAdmin();
    }

    // Menampilkan informasi perjalanan
    public void tampilkanTrip() {

        System.out.println("\n===== DETAIL PERJALANAN =====");

        System.out.println("Driver     : " + driver.getNama());
        System.out.println("Penumpang  : " + penumpang.getNama());
        System.out.println("Kendaraan  : " + kendaraan.getJenis());
        System.out.println("Jarak      : " + jarakKm + " km");
        System.out.println("Pembayaran : " + pembayaran);

        if (kendaraan instanceof KendaraanDasar) {
            KendaraanDasar data =
                    (KendaraanDasar) kendaraan;

            System.out.println("Merk       : " + data.getMerk());
            System.out.println("Plat       : " + data.getNomorPolisi());
        }

        System.out.println("Total      : Rp" + hitungTotal());
    }
}