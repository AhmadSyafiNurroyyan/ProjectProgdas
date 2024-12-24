import java.util.Scanner;

public class PerusahaanTravel {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Mobil[] mobil = {
        new Mobil("N993JI", 2015, "Merah", 100000),
        new Mobil("N423KO", 2020, "Biru", 200000),
        new Mobil("N945IR", 2018, "Kuning", 250000),
        new Mobil("N324FD", 2013, "Hitam", 300000),
        new Mobil("N873PO", 2022, "Putih", 450000),
    };

    Sopir[] sopir = {
        new Sopir("Joko", "Karanglo", 90000),
        new Sopir("Ridwan", "Blimbing", 87000),
        new Sopir("Yudi", "Sigura-gura", 95000),
        new Sopir("Anas", "LowokWaru", 90000),
        new Sopir("Rusdi", "Karawitan", 100000)
    };

    Pelanggan pelanggan = new Pelanggan();

    while (true) {
      System.out.println("\n----- Sewa Mobil -----");
      System.out.println("1. Identitas Pelanggan");
      System.out.println("2. Mulai Sewa");
      System.out.println("3. Keluar");
      System.out.print("Masukkan pilihan anda: ");
      int pilihan = scan.nextInt();
      scan.nextLine();

      switch (pilihan) {
        case 1:
          if (pelanggan.getNama() == null) {
            System.out
                .println("\nAnda belum memiliki data diri pelanggan. Silahkan mengisi data diri terlebih dahulu!");
            System.out.print("Masukkan nama: ");
            pelanggan.setNama(scan.nextLine());
            System.out.print("Masukkan nomor KTP: ");
            pelanggan.setNoKTP(scan.nextLine());
            System.out.print("Masukkan alamat: ");
            pelanggan.setAlamat(scan.nextLine());
            System.out.println("\nIdentitas pelanggan berhasil disimpan.");
          } else {
            System.out.println("\n----- Identitas Pelanggan -----");
            System.out.println(pelanggan);
          }
          break;

        case 2:
          if (pelanggan.getNama() == null) {
            System.out
                .println("\nAnda belum memiliki identitas pelanggan. Silahkan mengecek pada menu Identitas Pelanggan.");
          } else {
            System.out.println("\n----- Daftar Mobil -----");
            System.out.println("+----+------------+-------+--------+------------+");
            System.out.println("| No | No Polisi  | Tahun |  Warna | Harga Sewa |");
            System.out.println("+----+------------+-------+--------+------------+");
            for (int i = 0; i < mobil.length; i++) {
              if (mobil[i] != null) {
                System.out.printf("| %2d | %-10s | %-5d | %-6s | Rp%-8d |\n",
                    (i + 1),
                    mobil[i].getNoPolisi(),
                    mobil[i].getTahun(),
                    mobil[i].getWarna(),
                    mobil[i].getHargaSewa());
              }
            }
            System.out.println("+----+------------+-------+--------+------------+");

            System.out.print("Masukkan nomor mobil yang dipilih: ");
            int mobilIndex = scan.nextInt() - 1;

            if (mobilIndex >= 0 && mobilIndex < mobil.length && mobil[mobilIndex] != null) {
              System.out.println("Anda telah memilih mobil: " + mobil[mobilIndex].getNoPolisi() + " ("
                  + mobil[mobilIndex].getWarna() + ")");

              Mobil mobilDipilih = mobil[mobilIndex];
              mobil[mobilIndex] = null;

              System.out.println("\n----- Daftar Sopir -----");
              System.out.println("+----+----------+---------------+-----+-------------+");
              System.out.println("| No |   Nama   |     Alamat    | SIM | Gaji Harian |");
              System.out.println("+----+----------+---------------+-----+-------------+");
              for (int i = 0; i < sopir.length; i++) {
                if (sopir[i] != null) {
                  System.out.printf("| %2d | %-8s | %-13s | %-3c | Rp%-9d |\n",
                      (i + 1),
                      sopir[i].getNama(),
                      sopir[i].getAlamat(),
                      sopir[i].getSim(),
                      sopir[i].getGajiHarian());
                }
              }
              System.out.println("+----+----------+---------------+-----+-------------+");

              System.out.print("Masukkan nomor sopir yang dipilih: ");
              int sopirIndex = scan.nextInt() - 1;

              if (sopirIndex >= 0 && sopirIndex < sopir.length && sopir[sopirIndex] != null) {
                System.out.println("Anda telah memilih sopir: " + sopir[sopirIndex].getNama());

                Sopir sopirDipilih = sopir[sopirIndex];
                sopir[sopirIndex] = null;

                System.out.print("\nMasukkan jumlah hari sewa: ");
                int hari = scan.nextInt();

                int totalHarga = 0;
                if (mobilDipilih != null) {
                  totalHarga += mobilDipilih.getHargaSewa() * hari;
                }
                if (sopirDipilih != null) {
                  totalHarga += sopirDipilih.getGajiHarian() * hari;
                }

                System.out.println("\n----- Ringkasan Transaksi -----");
                System.out.println("Pelanggan  : " + pelanggan.getNama());
                System.out.println("Mobil      : " + mobilDipilih.getNoPolisi() + " (" + mobilDipilih.getWarna() + ")");
                System.out.println("Sopir      : " + sopirDipilih.getNama());
                System.out.println("Jumlah Hari: " + hari);
                System.out.println("Total Harga: Rp" + totalHarga);
              } else {
                System.out.println("Pilihan sopir tidak valid.");
              }

            } else {
              System.out.println("Pilihan mobil tidak valid.");
            }
          }
          break;

        case 3:
          System.out.println("Terima kasih, silahkan datang kembali!");
          scan.close();
          return;

        default:
          System.out.println("Masukkan pilihan yang valid!");
      }
    }
  }
}