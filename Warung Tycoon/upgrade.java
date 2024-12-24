/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
 1. Ahmad Syafi Nurroyyan: mengerjakan kode program pada kelas menu dan GameOver (90)
2. Kendra Gavin Tri Daninda: mengerjakan kode program pada kelas belanja, inventory, dan jualan (100)
3. Shafa Rizwana Zarin: mengerjakan kode program pada kelas 

*/

import java.util.Scanner;

public class upgrade {
    private int status = 0;
    Scanner input = new Scanner(System.in);

    public int upgradeToko(int statusToko, int modal) {
        if (statusToko == 0) {
            System.out.println("Apakah anda ingin upgrade toko menjadi SuperMart dengan membayar Rp15.000.000? Y/N");
            String pil1 = input.next();
            boolean jaw1 = "Y".equalsIgnoreCase(pil1);
            if (jaw1) {
                if (modal >= 15000000) {
                    modal = modal - 15000000;
                    this.status = 1;
                    statusToko = 1;
                    System.out.println("Selamat Toko Anda Telah Menjadi SuperMart");
                } else {
                    System.out.println("Uang Anda Tidak Cukup\n");
                }
            } else {
                System.out.println();
            }
        } else if (statusToko == 1) {
            System.out.println("Apakah anda ingin upgrade toko menjadi HyperIndo dengan membayar Rp50.000.000? Y/N");
            String pil2 = input.next();
            boolean jaw2 = "Y".equalsIgnoreCase(pil2);
            if (jaw2) {
                if (modal >= 50000000) {
                    modal = modal - 50000000;
                    this.status = 2;
                    statusToko = 2;
                    System.out.println("Selamat Toko Anda Telah Menjadi HyperIndo");
                } else {
                    System.out.println("Uang Anda Tidak Cukup\n");
                }
            } else {
                System.out.println();
            }
        } else if (statusToko == 2) {
            System.out.println("Toko anda sudah Maksimal");
        }
        return modal;
    }

    public int getStatus() {
        return this.status;
    }
}