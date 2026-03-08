import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Membuat 5 objek mahasiswa dalam array
        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        //Menampilkan semua data mahasiswa
        for (int i = 0; i < daftar.length; i++) {
            System.out.println("=== Data Mahasiswa ===");
            daftar[i].tampilkanInfo();
            System.out.println();
        }

        // Update IPK berdasarkan input pengguna
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimUpdate = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getNim().equals(nimUpdate)) {
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = scanner.nextDouble();
                daftar[i].updateIpk(ipkBaru);
                System.out.println("Data berhasil diperbarui!\n");
                System.out.println("=== Data Mahasiswa ===");
                daftar[i].tampilkanInfo();
                System.out.println("Status: " + daftar[i].cekKelulusan());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NIM tidak ditemukan!");
        }

        //Tampilkan predikat akademik
        System.out.println("\n=== Soal 3: Predikat Akademik ===\n");
        for (int i = 0; i < daftar.length; i++) {
            System.out.println("=== Data Mahasiswa ===");
            daftar[i].tampilkanInfo();
            System.out.println("Status: " + daftar[i].cekKelulusan());
            System.out.println("Predikat: " + daftar[i].hitungPredikat());
            System.out.println();
        }

        scanner.close();
    }
}
