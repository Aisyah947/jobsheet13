public class ModifPengunjungKafe17 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");

        for (String nama : namaPengunjung) {
            System.out.println("_ " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}