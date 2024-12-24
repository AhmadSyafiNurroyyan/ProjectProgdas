/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

import java.util.Scanner;

public class menu {
    inventory gudang = new inventory();
    WarungTycoon warung = new WarungTycoon();
    jualan jualan = new jualan();
    objective obj = new objective();
    Hasil stat = new Hasil();
    GameOver go = new GameOver();
    belanja belanja = new belanja();
    upgrade upgrade = new upgrade();
    public int status = 0;
    public int modal = warung.modalAwal;

    public void listMenu() {
        int p;
        int pengeluaran = 0;
        Boolean cekStatusWarung = false;
        Boolean cekStatusSuperMart = false;
        gudang.setIsiArray(gudang.daftarBarang);
        gudang.setIsiArray(gudang.daftarGudang);
        barang[] daftarBarang = gudang.listBarang();
        barang[] daftarGudang = gudang.listGudang();
        int totalBarang = 0;
        int untung = 0;
        int totalStock = 0;
        System.out.println("\n-------------------GAME WARUNG TYCOON-------------------");
        do {
            Scanner input = new Scanner(System.in);
            int hari = jualan.getHari();
            if (daftarGudang[5].getNamaBarang() != null || totalStock > 500) {
                cekStatusWarung = true;
            } else if (daftarGudang[14].getNamaBarang() != null || totalStock > 1000) {
                cekStatusSuperMart = true;
            }
            if (hari == 1) {
                obj.objectiveGame(status);
                System.out.println("HARI PERTAMA");
            } else {
                System.out.println("HARI KE-" + jualan.getHari());
            }
            System.out.printf("Modal: Rp" + String.format("%,d\n", modal).replace(',', '.'));
            System.out.println("1. Lihat Gudang & Ganti Harga Jual");
            System.out.println("2. Belanja Barang");
            System.out.println("3. Mulai Jualan");
            System.out.println("4. Upgrade Warung");
            System.out.println("5. Selesaikan Berjualan dan Lihat hasil jualan");
            System.out.print("Pilihan Anda : ");
            p = input.nextInt();
            switch (p) {
                case 1:
                    gudang.listGudang(daftarGudang, daftarBarang);
                    break;
                case 2:
                    modal = belanja.belanjaBarang(daftarBarang, daftarGudang, status, cekStatusWarung,
                            cekStatusSuperMart, modal, totalStock);
                    pengeluaran = belanja.getPengeluaran();
                    totalStock = belanja.getTotalStock();
                    break;
                case 3:
                    modal = jualan.jual(status, daftarGudang, modal, totalStock);
                    totalBarang = jualan.getTotalBarang();
                    untung = jualan.getUntung();
                    totalStock = jualan.gettotalStock();
                    break;
                case 4:
                    modal = upgrade.upgradeToko(status, modal);
                    status = upgrade.getStatus();
                    break;
                case 5:
                    stat.hasilakhir(status, jualan.getHari(), jualan.getTotalBarang(), jualan.getUntung(), pengeluaran);
                    input.close();
                    break;
            }
            p = go.kondisi(status, modal, pengeluaran, p, hari, totalBarang, untung);
        } while (p != 5);
    }
}