/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

import java.util.Scanner;

public class inventory {
    public barang[] daftarGudang = new barang[99];
    public barang[] daftarBarang = new barang[25];
    Scanner input = new Scanner(System.in);
    
    public barang[] listBarang() {
        daftarBarang[0].setBarang("Pepsodent", 10000, 0);
        daftarBarang[1].setBarang("Air Mineral", 2000, 0);
        daftarBarang[2].setBarang("Chiki", 5000, 0);
        daftarBarang[3].setBarang("Beng-Beng", 2000, 0);
        daftarBarang[4].setBarang("Mie Instan", 2000, 0);
        daftarBarang[5].setBarang("Cola", 4000, 0);
        daftarBarang[6].setBarang("Telur", 1500, 0);
        daftarBarang[7].setBarang("Roti Coklat", 8000, 0);
        daftarBarang[8].setBarang("Minyak", 30000, 0);
        daftarBarang[9].setBarang("Susu", 7000, 0);
        daftarBarang[10].setBarang("Tissue", 3000, 0);
        daftarBarang[11].setBarang("Roti Tawar", 15000, 0);
        daftarBarang[12].setBarang("Beras", 60000, 0);
        daftarBarang[13].setBarang("Sabun", 20000, 0);
        daftarBarang[14].setBarang("Gula Pasir", 15000, 0);
        daftarBarang[15].setBarang("Shampoo", 13000, 0);
        daftarBarang[16].setBarang("Fanta", 5000, 0);
        daftarBarang[17].setBarang("Teh", 8000, 0);
        daftarBarang[18].setBarang("Kopi", 15000, 0);
        daftarBarang[19].setBarang("Rokok", 20500, 0);
        daftarBarang[20].setBarang("Wipol", 5900, 0);
        daftarBarang[21].setBarang("Saos", 20800, 0);
        daftarBarang[22].setBarang("Kecap", 10000, 0);
        daftarBarang[23].setBarang("Nabati", 5700, 0);
        daftarBarang[24].setBarang("Biskuat", 4100, 0);
        return daftarBarang;
    }

    public barang[] listGudang() {
        return daftarGudang;
    }

    public void setIsiArray(barang[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new barang();
        }
    }

    public void beliBarang(int i, barang[] daftarBarang, barang[] daftarGudang) {
        for (int j = 0; j < daftarGudang.length;j++) {
            if (daftarBarang[i].getNamaBarang().equals(daftarGudang[j].getNamaBarang())) {
                break;
            }
            if (daftarGudang[j].getNamaBarang()==null) {
                daftarGudang[j].setnamaBarang(daftarBarang[i].getNamaBarang());
                daftarGudang[j].setHargaBarang(daftarBarang[i].getHargaBarang());
                break;
            }
        }
    }

    public void banyakBarang(int i, int p, barang[] daftarBarang, barang[] daftarGudang) {
        for (int j = 0; j < daftarGudang.length;j++) {
            if (daftarBarang[p].getNamaBarang().equals(daftarGudang[j].getNamaBarang())) {
                int temp = daftarGudang[j].getJumlahBarang();
                temp += i;
                daftarGudang[j].setJumlahBarang(temp);
                break;
            }
            if (daftarGudang[j].getJumlahBarang()==0) {
                daftarGudang[j].setJumlahBarang(i);
                break;
            }
        }   
    }

    public void hargaJual(int i, int p, barang[] daftarGudang) {
        daftarGudang[i].sethargaJual(p);
    }

    public void listGudang(barang[] daftarGudang, barang[] daftarBarang) {
        System.out.println("\n                                    GUDANG");
        System.out.println(" _________________________________________________________________________________");
        System.out.printf("| NO ||      %-11s ||    %10s    ||    %10s    || %6s |\n","Barang","Harga Beli","Harga Jual","Jumlah Barang");
        System.out.println("|----||------------------||------------------||------------------||---------------|");
        for (int i = 0; i < daftarGudang.length; i++) {
            if (daftarGudang[i].getNamaBarang()!=null) {
                System.out.printf("| %02d ||   %-15s|| %10d%6s || %10d%6s || %8d%7c\n",(i+1),daftarGudang[i].getNamaBarang(),daftarGudang[i].getHargaBarang(),"",daftarGudang[i].gethargaJual(),"",daftarGudang[i].getJumlahBarang(),'|');
            }
        }
        System.out.println("|____||__________________||__________________||__________________||_______________|\n");
        System.out.println("Apakah anda ingin mengganti harga jual? Y/N");
        String pil = input.next();
        boolean jaw = "Y".equalsIgnoreCase(pil);
        if (jaw) {
            System.out.print("Ingin mengganti harga jual barang apa? (Masukkan nomor) ");
            int i = 0;
            boolean p;
            do {
                i = input.nextInt();
                if (i<(daftarBarang.length-1)) {
                    p = false;
                }
                else {
                    System.out.println("Barang Tidak Ada, Masukkan Nomor Barang yang Valid!!");
                    p = true;
                }
            } while(p);
            System.out.print("Berapa harga jual barang tersebut? ");
            int h = input.nextInt();
            hargaJual((i-1), h, daftarGudang);
            System.out.println();
        }
        else {
            System.out.println();
        }
    }
}