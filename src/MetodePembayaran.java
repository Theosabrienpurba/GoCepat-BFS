public enum MetodePembayaran {

    TUNAI(0),
    E_WALLET(1000),
    KARTU(2000);

    private double biayaAdmin;

    MetodePembayaran(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void tampilkanInfo() {
        System.out.println(
                this.name() + " - Biaya Admin: Rp" + biayaAdmin
        );
    }
}