public class Pelanggan {
    int kode = (int) (Math.random() * 100);
    String kodePelanggan;
    String nama;
    String nomorTelepon;
    String status;
    String[] history = new String[10];
    int jumlahHistory = 0;

    Pelanggan(String kodePelanggan, String nama, String nomorTelepon, String status) {
        this.kodePelanggan = kodePelanggan;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.status = status;
    }

    public void tampilkanPelanggan() {
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Nomor telepon : " + nomorTelepon);
        System.out.println("Kode pelanggan: " + kodePelanggan + kode);
        System.out.println("Status        : " + status);
        System.out.println("History       :");

        for (int i = 0; i < jumlahHistory; i++) {
            System.out.println((i + 1) + ". " + history[i]);
        }
    }

    public void menonton(String judul) {
        System.out.println("Menonton film " + judul + "...");
        if (jumlahHistory < history.length) {
            history[jumlahHistory] = judul;
            jumlahHistory++;
        } else {
            System.out.println("History penuh!");
        }
    }

    public void mengubahStatus(String statusBaru) {
        if (statusBaru.equals("reguler") || statusBaru.equals("platinum")) {
            if (!status.equals(statusBaru)) {
                status = statusBaru;
                System.out.println("Status keanggotaan berubah menjadi: " + status);
            } else {
                System.out.println("Status keanggotaan sudah " + status + ".");
            }
        } else {
            System.out.println("Masukkan status yang valid!");
        }
    }
}
