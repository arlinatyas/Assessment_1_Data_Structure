public class Mahasiswa {
    //Atribut private untuk enkapsulasi
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    /**
     *Constructor untuk menginisialisasi data mahasiswa
     */
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    /**
     *Getter untuk atribut nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Getter untuk atribut NIM
     */
    public String getNim() {
        return nim;
    }

    /**
     *Getter untuk atribut jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     *Getter untuk atribut IPK
     */
    public double getIpk() {
        return ipk;
    }

    /**
     *Setter untuk atribut IPK
     */
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    /**
     *Method untuk menampilkan data mahasiswa
     */
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    /**
     *Method untuk mengecek status kelulusan
     */
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    /**
     *Method untuk memperbarui IPK mahasiswa
     */
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    /**
     *Method untuk menghitung predikat akademik
     */
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}
