/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

public class GameOver {
    jualan jualan = new jualan();
    Hasil stat = new Hasil();
    public int kondisi(int status, int modal, int pengeluaran, int p, int hari, int totalBarang, int untung) {
        if (modal<0) {
            System.out.println();
            System.out.println("Anda terlilit hutang!!!");
            System.out.println("GAME OVER");
            stat.hasilakhir(status, hari, totalBarang, untung, pengeluaran);
            p = 5;
        }
        if (hari==30) {
            if (status==0) {
                System.out.println();
                System.out.println("Anda Tidak Dapat Mencapai Objective Dalam Waktu 30 Hari");
                System.out.println("GAME OVER");
                stat.hasilakhir(status, hari, totalBarang, untung, pengeluaran);
                p = 5;
            }
        }
        else if (hari==60) {
            if (status==1) {
                System.out.println();
                System.out.println("Anda Tidak Dapat Mencapai Objective Dalam Waktu 30 Hari");
                System.out.println("GAME OVER");
                stat.hasilakhir(status, hari, totalBarang, untung, pengeluaran);
                p = 5;
            }
        }
        return p;
    }
}
