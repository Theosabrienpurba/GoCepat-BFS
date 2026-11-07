
public class Graph {

    private int[][] daftarTetangga;
    private int[] jumlahTetangga;
    private int jumlahSimpul;

    // Constructor untuk membuat graph
    public Graph(int jumlahSimpul) {
        this.jumlahSimpul = jumlahSimpul;

        daftarTetangga = new int[jumlahSimpul][2];
        jumlahTetangga = new int[jumlahSimpul];
    }

    // Memperbesar kapasitas array jika penuh
    private void perbesarArray(int simpul) {
        int kapasitasBaru = daftarTetangga[simpul].length * 2;

        int[] arrayBaru = new int[kapasitasBaru];

        for (int i = 0; i < jumlahTetangga[simpul]; i++) {
            arrayBaru[i] = daftarTetangga[simpul][i];
        }

        daftarTetangga[simpul] = arrayBaru;
    }

    // Menambahkan jalan antara dua persimpangan
    public void tambahJalan(int asal, int tujuan) {

        if (jumlahTetangga[asal] == daftarTetangga[asal].length) {
            perbesarArray(asal);
        }

        daftarTetangga[asal][jumlahTetangga[asal]] = tujuan;
        jumlahTetangga[asal]++;

        if (jumlahTetangga[tujuan] == daftarTetangga[tujuan].length) {
            perbesarArray(tujuan);
        }

        daftarTetangga[tujuan][jumlahTetangga[tujuan]] = asal;
        jumlahTetangga[tujuan]++;
    }

    // BFS untuk mencari driver terdekat
    public int bfsCariTerdekat(int asal, boolean[] adalahDriver) {

        boolean[] sudahDikunjungi = new boolean[jumlahSimpul];
        int[] queue = new int[jumlahSimpul];

        int depan = 0;
        int belakang = 0;

        // Masukkan simpul awal ke queue
        queue[belakang++] = asal;
        sudahDikunjungi[asal] = true;

        while (depan < belakang) {

            int sekarang = queue[depan++];

            // Periksa apakah terdapat driver
            if (adalahDriver[sekarang]) {
                return sekarang;
            }

            // Periksa seluruh tetangga
            for (int i = 0; i < jumlahTetangga[sekarang]; i++) {

                int tetangga = daftarTetangga[sekarang][i];

                if (!sudahDikunjungi[tetangga]) {

                    sudahDikunjungi[tetangga] = true;

                    queue[belakang++] = tetangga;
                }
            }
        }

        // Jika tidak ditemukan driver
        return -1;
    }

    // Menghitung jumlah hop dari asal ke tujuan
    public int hitungHop(int asal, int tujuan) {

        boolean[] dikunjungi = new boolean[jumlahSimpul];
        int[] jarak = new int[jumlahSimpul];
        int[] queue = new int[jumlahSimpul];

        int depan = 0;
        int belakang = 0;

        queue[belakang++] = asal;
        dikunjungi[asal] = true;

        while (depan < belakang) {

            int sekarang = queue[depan++];

            if (sekarang == tujuan) {
                return jarak[sekarang];
            }

            for (int i = 0; i < jumlahTetangga[sekarang]; i++) {

                int tetangga = daftarTetangga[sekarang][i];

                if (!dikunjungi[tetangga]) {

                    dikunjungi[tetangga] = true;
                    jarak[tetangga] = jarak[sekarang] + 1;

                    queue[belakang++] = tetangga;
                }
            }
        }

        return -1;
    }
}
