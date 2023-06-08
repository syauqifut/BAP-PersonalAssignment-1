import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di perpustakaan DAVID");

        int jenisBuku = memintaJenisBuku(scanner);

        long selisihHari = menghitungHari(scanner);

        int denda = menghitungDenda(jenisBuku, selisihHari);

        System.out.println("Jumlah denda yang harus dibayar : Rp." + denda);
    }

    // Fungsi untuk meminta input jenis buku
    public static int memintaJenisBuku(Scanner scanner) {
        System.out.println("Silakan pilih jenis buku:");
        System.out.println("1. Pelajaran");
        System.out.println("2. Novel");
        System.out.println("3. Skripsi");
        System.out.print("Pilihan Anda (1-3): ");
        return scanner.nextInt();
    }

    // Fungsi menghitung denda
    public static int menghitungDenda(int jenisBuku, long selisihHari) {
        int denda = 0;
        if (selisihHari > 10) {
            if(jenisBuku == 1){
                denda = (int) (selisihHari - 10) * 2000;
            } else if (jenisBuku == 2) {
                denda = (int) (selisihHari - 10) * 5000;
            } else if (jenisBuku == 3) {
                denda = (int) (selisihHari - 10) * 10000;
            }
        }
        return denda;
    }

    // Fungsi untuk menginputkan tanggal pinjam, tanggal kembali, dan menghitung selisih hari
    public static long menghitungHari(Scanner scanner) {
        System.out.print("Masukkan tanggal Pinjam (yyyy-mm-dd) : ");
        String tanggalPinjamStr = scanner.next();
        LocalDate tanggalPinjamDate = LocalDate.parse(tanggalPinjamStr);

        System.out.print("Masukkan tanggal Kembali (yyyy-mm-dd) : ");
        String tanggalKembaliStr = scanner.next();
        LocalDate tanggalKembaliDate = LocalDate.parse(tanggalKembaliStr);

        long selisihHari = ChronoUnit.DAYS.between(tanggalPinjamDate, tanggalKembaliDate);

        return selisihHari;
    }
}
