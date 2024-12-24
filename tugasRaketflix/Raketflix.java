import java.util.Scanner;

public class Raketflix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DaftarFilm daftarFilm = new DaftarFilm();

        System.out.print("Masukkan nama kamu: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan nomor telepon kamu: ");
        String nomorTelepon = scan.nextLine();

        Pelanggan pelanggan = new Pelanggan("RKTFX", nama, nomorTelepon, "reguler");

        boolean loop = true;
        while (loop) {
            System.out.println("\nPILIHAN MENU");
            System.out.println("1. IDENTITAS PELANGGAN");
            System.out.println("2. MENONTON FILM");
            System.out.println("3. MENGUBAH STATUS");
            System.out.println("4. KELUAR");
            System.out.print("Masukkan pilihan menu: ");
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    pelanggan.tampilkanPelanggan();
                    break;
                case 2:
                    System.out.println("Status pelanggan saat ini: " + pelanggan.status);
                    if (pelanggan.status.equals("reguler")) {
                        System.out.println("Kamu hanya dapat menonton 2 film terbaru (2024)\n");
                        System.out.println("DAFTAR FILM");
                        daftarFilm.tampilkanFilmReguler();
                    } else {
                        System.out.println("Kamu dapat menonton seluruh film.\n");
                        System.out.println("DAFTAR FILM");
                        daftarFilm.tampilkanFilmPlatinum();
                    }

                    System.out.print("Silahkan pilih film dengan memasukkan judul: ");
                    scan.nextLine();
                    String judulDipilih = scan.nextLine();

                    if (daftarFilm.ValidJudul(judulDipilih, pelanggan.status)) {
                        pelanggan.menonton(judulDipilih);
                    } else {
                        System.out.println("Masukkan judul yang valid!");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan status baru (reguler/platinum): ");
                    scan.nextLine();
                    String statusBaru = scan.nextLine();
                    pelanggan.mengubahStatus(statusBaru);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan Raketflix!");
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        scan.close();
    }
}
