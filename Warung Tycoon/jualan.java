/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

public class jualan {
    private int totalBarang = 0;
    private int hari = 1;
    private int untung = 0;
    private int totalStock = 0;

    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public int jual(int status, barang[] daftarGudang, int modal, int totalStock) {
        System.out.println();
        int penghitung = 0;
        int banyakRandom = 0;
        int ran = 2;
        for (int j = 0; j < daftarGudang.length; j++) {
            if (daftarGudang[j].getNamaBarang() != null) {
                penghitung++;
            }
        }
        int pelanggan = 0;
        if (penghitung == 0) {
            System.out.println("Stok Toko Anda Habis, Segera Beli Stock Baru");
            System.out.println();
            hari -= 1;
        } else {
            switch (status) {
                case 0:
                    pelanggan = random(5, 25);
                    ran = 2;
                    break;
                case 1:
                    pelanggan = random(10, 60);
                    ran = 4;
                    break;
                case 2:
                    pelanggan = random(15, 95);
                    ran = 6;
            }
            for (int j = 0; j < pelanggan; j++) {
                banyakRandom = random(1, ran);
                int barangRandom = random(0, penghitung - 1);
                if (daftarGudang[barangRandom].gethargaJual() >= (3 * daftarGudang[barangRandom].getHargaBarang())) {
                    if (daftarGudang[barangRandom].getNamaBarang() == null) {
                        break;
                    } else {
                        System.out.println("Pelanggan Datang dan Ingin Membeli "
                                + daftarGudang[barangRandom].getNamaBarang() + ", Tetapi Harganya Kemahalan");
                    }
                } else {
                    if (daftarGudang[barangRandom].getJumlahBarang() < banyakRandom) {
                        banyakRandom = daftarGudang[barangRandom].getJumlahBarang();
                        if (daftarGudang[barangRandom].getJumlahBarang() != 0) {
                            if (daftarGudang[barangRandom].getNamaBarang() == null) {
                                break;
                            } else {
                                System.out.println("Pelanggan Datang dan Membeli "
                                        + daftarGudang[barangRandom].getNamaBarang() + " Sebanyak " + banyakRandom);
                                totalBarang += banyakRandom;
                                int temp = daftarGudang[barangRandom].getJumlahBarang() - banyakRandom;
                                daftarGudang[barangRandom].setJumlahBarang(temp);
                                if (daftarGudang[barangRandom].gethargaJual() != 0) {
                                    untung += (daftarGudang[barangRandom].gethargaJual() * banyakRandom);
                                } else {
                                    untung += (daftarGudang[barangRandom].getHargaBarang() * banyakRandom);
                                }
                                modal += untung;
                                totalStock -= banyakRandom;
                                this.totalStock = totalStock;
                                if (daftarGudang[barangRandom].getJumlahBarang() <= 0) {
                                    daftarGudang[barangRandom].setnamaBarang(null);
                                }
                                for (int i = 0; i < (daftarGudang.length - 1); i++) {
                                    if (daftarGudang[i].getNamaBarang() == null) {
                                        daftarGudang[i].setGudang(daftarGudang[i + 1].getNamaBarang(),
                                                daftarGudang[i + 1].getHargaBarang(),
                                                daftarGudang[i + 1].gethargaJual(),
                                                daftarGudang[i + 1].getJumlahBarang());
                                        daftarGudang[i + 1].setGudang(null, 0, 0, 0);
                                    }
                                }
                            }
                        }
                    } else {
                        if (daftarGudang[barangRandom].getJumlahBarang() != 0) {
                            if (daftarGudang[barangRandom].getNamaBarang() == null) {
                                break;
                            } else {
                                System.out.println("Pelanggan Datang dan membeli "
                                        + daftarGudang[barangRandom].getNamaBarang() + " Sebanyak " + banyakRandom);
                                totalBarang += banyakRandom;
                                int temp = daftarGudang[barangRandom].getJumlahBarang() - banyakRandom;
                                daftarGudang[barangRandom].setJumlahBarang(temp);
                                modal += (daftarGudang[barangRandom].gethargaJual() * banyakRandom);
                                untung += (daftarGudang[barangRandom].gethargaJual() * banyakRandom);
                                totalStock -= banyakRandom;
                                this.totalStock = totalStock;
                                if (daftarGudang[barangRandom].getJumlahBarang() <= 0) {
                                    daftarGudang[barangRandom].setnamaBarang(null);
                                }
                                for (int i = 0; i < (daftarGudang.length - 1); i++) {
                                    if (daftarGudang[i].getNamaBarang() == null) {
                                        daftarGudang[i].setGudang(daftarGudang[i + 1].getNamaBarang(),
                                                daftarGudang[i + 1].getHargaBarang(),
                                                daftarGudang[i + 1].gethargaJual(),
                                                daftarGudang[i + 1].getJumlahBarang());
                                        daftarGudang[i + 1].setGudang(null, 0, 0, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        hari++;
        return modal;
    }

    public int getTotalBarang() {
        return totalBarang;
    }

    public int getHari() {
        return hari;
    }

    public int getUntung() {
        return untung;
    }

    public int gettotalStock() {
        return totalStock;
    }
}