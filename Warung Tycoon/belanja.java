/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

import java.util.Scanner;

public class belanja {
    Scanner input = new Scanner(System.in);
    inventory gudang = new inventory();
    private int pengeluaran = 0;
    private int totalStock = 0;

    public int belanjaBarang(barang[] daftarBarang, barang[] daftarGudang, int status, boolean cekStatusWarung,
            boolean cekStatusSuperMart, int modal, int totalStock) {
        System.out.println("\n                BELANJA BARANG");
        System.out.println(" ____________________________________________");
        System.out.printf("| NO ||      %-11s ||   %10s   |\n", "Barang", "Harga Barang");
        System.out.println("|----||------------------||------------------|");
        int barang = daftarBarang.length;
        if (status == 0) {
            barang = 9;
        } else if (status == 1) {
            barang = 15;
        }
        for (int i = 0; i < barang; i++) {
            System.out.printf("| %02d ||   %-15s|| %10d%6s%2c\n", (i + 1), daftarBarang[i].getNamaBarang(),daftarBarang[i].getHargaBarang(), "", '|');
        }
        System.out.println("|____||__________________||__________________|");
        System.out.printf(" Uang: Rp" + String.format("%,d\n\n", modal).replace(',', '.'));
        int i;
        if (status == 0) {
            System.out.print("Ingin beli barang apa? (Masukkan Nomor) : ");
            i = input.nextInt();
            System.out.print("Berapa banyak? ");
            int b = input.nextInt();
            totalStock += b;
            this.totalStock = totalStock;
            if (cekStatusWarung == false && totalStock <= 500) {
                gudang.beliBarang(i - 1, daftarBarang, daftarGudang);
                gudang.banyakBarang(b, (i - 1), daftarBarang, daftarGudang);
                modal = modal - (daftarBarang[i - 1].getHargaBarang() * b);
                pengeluaran += (daftarBarang[i - 1].getHargaBarang() * b);
                if (modal >= 0) {
                    System.out.println("Anda berhasil membeli " + daftarBarang[i - 1].getNamaBarang() + " sebanyak " + b);
                    System.out.println();
                }
            } else {
                System.out.println("Gudang anda sudah penuh, Upgrade apabila ingin menambah kapasitas gudang.");
                totalStock -= b;
                this.totalStock = totalStock;
                System.out.println();
            }
        } else if (status == 1) {
            System.out.print("Ingin beli barang apa? (Masukkan Nomor) : ");
            i = input.nextInt();
            System.out.print("Berapa banyak? ");
            int b = input.nextInt();
            totalStock += b;
            this.totalStock = totalStock;
            if (cekStatusSuperMart == false && totalStock <= 1000) {
                gudang.beliBarang(i - 1, daftarBarang, daftarGudang);
                gudang.banyakBarang(b, (i - 1), daftarBarang, daftarGudang);
                modal = modal - (daftarBarang[i - 1].getHargaBarang() * b);
                pengeluaran += (daftarBarang[i - 1].getHargaBarang() * b);
                if (modal >= 0) {
                    System.out.println("Anda berhasil membeli " + daftarBarang[i - 1].getNamaBarang() + " sebanyak " + b);
                    System.out.println();
                }
            } else {
                System.out.println("Gudang anda sudah penuh, Upgrade apabila ingin menambah kapasitas gudang.");
                totalStock -= b;
                this.totalStock = totalStock;
                System.out.println();
            }
        } else if (status == 2) {
            System.out.print("Ingin beli barang apa? (Masukkan Nomor) : ");
            i = input.nextInt();
            System.out.print("Berapa banyak? ");
            int b = input.nextInt();
            gudang.beliBarang(i - 1, daftarBarang, daftarGudang);
            gudang.banyakBarang(b, (i - 1), daftarBarang, daftarGudang);
            modal = modal - (daftarBarang[i - 1].getHargaBarang() * b);
            pengeluaran += (daftarBarang[i - 1].getHargaBarang() * b);
            if (modal >= 0) {
                System.out.println("Anda berhasil membeli " + daftarBarang[i - 1].getNamaBarang() + " sebanyak " + b);
                System.out.println();
            }
        }
        return modal;
    }

    public int getPengeluaran() {
        return pengeluaran;
    }

    public int getTotalStock() {
        return totalStock;
    }
}