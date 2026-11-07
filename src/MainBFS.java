
public class MainBFS {

    public static void main(String[] args) {

        // Membuat graph dengan 8 persimpangan
        Graph graph = new Graph(8);

        // Menghubungkan persimpangan
        graph.tambahJalan(0, 1);
        graph.tambahJalan(0, 2);
        graph.tambahJalan(1, 3);
        graph.tambahJalan(2, 4);
        graph.tambahJalan(3, 5);
        graph.tambahJalan(4, 5);
        graph.tambahJalan(5, 6);
        graph.tambahJalan(6, 7);

        // Menentukan lokasi driver
        boolean[] adalahDriver = new boolean[8];

        adalahDriver[2] = true;
        adalahDriver[5] = true;
        adalahDriver[7] = true;

        System.out.println("=== SIMULASI PENCARIAN DRIVER TERDEKAT ===");

        System.out.println("Jumlah persimpangan: 8");

        System.out.println("\nLokasi driver:");
        System.out.println("Driver 1 berada di simpul 2");
        System.out.println("Driver 2 berada di simpul 5");
        System.out.println("Driver 3 berada di simpul 7");

        // Pencarian dari penumpang pertama
        int penumpang1 = 0;

        int driver1 = graph.bfsCariTerdekat(
                penumpang1, adalahDriver
        );

        System.out.println("\nPenumpang 1 berada di simpul " + penumpang1);

        if (driver1 != -1) {
            System.out.println("Driver terdekat ditemukan di simpul " + driver1);
            System.out.println("Jumlah hop: " +
                    graph.hitungHop(penumpang1, driver1));
        } else {
            System.out.println("Driver tidak ditemukan");
        }

        // Pencarian dari penumpang kedua
        int penumpang2 = 6;

        int driver2 = graph.bfsCariTerdekat(
                penumpang2, adalahDriver
        );

        System.out.println("\nPenumpang 2 berada di simpul " + penumpang2);

        if (driver2 != -1) {
            System.out.println("Driver terdekat ditemukan di simpul " + driver2);
            System.out.println("Jumlah hop: " +
                    graph.hitungHop(penumpang2, driver2));
        } else {
            System.out.println("Driver tidak ditemukan");
        }
    }
}
