/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

public class Hasil {

    public void hasilakhir(int status, int hari, int totalBarang, int untung, int pengeluaran) {
        String toko = "";
        switch (status) {
            case 0:
                toko = "WARUNG";
                break;
            case 1:
                toko = "SUPERMART";
                break;
            case 2:
                toko = "HYPERMART";
                break;
        }
        System.out.println();
        System.out.println("                        HASIL");
        if (status == 0) {
            System.out.println("ANDA TIDAK MENGUPGRADE TOKO ANDA SAMA SEKALI");
        } else {
            System.out.println("ANDA TELAH MENGUPGRADE TOKO ANDA SAMPAI MENJADI " + toko);
        }
        System.out.println("ANDA TELAH MENJALANKAN TOKO SELAMA " + hari + " HARI");
        System.out.println("ANDA TELAH MENJUAL BARANG SEBANYAK " + totalBarang + " BARANG");
        System.out.println("TOTAL PENDAPATAN YANG ANDA DAPATKAN RP" + String.format("%,d", untung).replace(',', '.'));
        System.out.println(
                "TOTAL PENGELUARAN YANG ANDA KELUARKAN RP" + String.format("%,d", pengeluaran).replace(',', '.'));
        if ((untung - pengeluaran) < 0) {
            System.out.println("ANDA TELAH RUGI SEBESAR Rp"
                    + String.format("%,d", ((untung - pengeluaran) * -1)).replace(',', '.'));
        } else {
            System.out.println("ANDA TELAH MERAUP TOTAL KEUNTUNGAN SEBESAR RP"
                    + String.format("%,d", (untung - pengeluaran)).replace(',', '.'));
        }
    }
}