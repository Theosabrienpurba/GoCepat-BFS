
public class Main {

    public static void main(String[] args) {

        // Membuat objek kendaraan menggunakan Polymorphism
        Kendaraan[] daftarKendaraan = {
                new Motor("Honda Vario", "B 5864 SUS"),
                new Mobil("Honda Brio", "B 7824 BAI"),
                new MobilListrik("BYD SEAL", "B 9029 DD"),
                new SepedaListrik("Polygon", "B 3456 DP")
        };

        double jarakKm = 5;

        // Menampilkan tarif menggunakan Polymorphism
        System.out.println("===== DAFTAR TARIF GOCEPAT =====");

        for (Kendaraan k : daftarKendaraan) {

            System.out.println("\nJenis Kendaraan : " + k.getJenis());
            System.out.println("Jarak           : " + jarakKm + " km");
            System.out.println("Tarif           : Rp" +
                    k.hitungTarif(jarakKm));
        }

        // Menampilkan tarif menggunakan Enum
        System.out.println("\n===== PERHITUNGAN TARIF ENUM =====");

        for (JenisKendaraan jenis : JenisKendaraan.values()) {

            System.out.println("\nJenis Kendaraan : " + jenis);
            System.out.println("Jarak           : " + jarakKm + " km");
            System.out.println("Tarif           : Rp" +
                    jenis.hitungTarif(jarakKm));
        }

        // Membuat objek driver
        Driver driver = new Driver(
                "Theo Sabrien Purba", "D032"
        );

        // Membuat objek penumpang
        Penumpang penumpang = new Penumpang(
                "Nelson Pardosi", "0822772388334"
        );

        // Membuat objek perjalanan menggunakan mobil
        Trip trip = new Trip(
                driver,
                penumpang,
                daftarKendaraan[1],
                jarakKm,
                MetodePembayaran.E_WALLET
        );

        // Menampilkan informasi perjalanan
        trip.tampilkanTrip();
    }
}
