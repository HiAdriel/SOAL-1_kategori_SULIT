import java.util.Scanner;

public class RataRataNilaiRPL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Input nilai per siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n===== HASIL REKAP NILAI =====");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
