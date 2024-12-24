/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

public class objective {
    
    public void objectiveGame(int status) {
        String sts = "Warung";
        switch (status) {
            case 0:
            sts = "SuperMart";
            break;
            case 1:
            sts = "HyperMart";
            break;
            case 2:
            sts = null;
            break;
        }
        if (sts!=null) {
            System.out.println("Anda Diberikan 30 Hari Untuk Upgrade Ke "+sts);
            System.out.println("Apabila Anda Belum Upgrade Setelah Masa Tenggat, Maka Akan Game Over");
        }
        else {
            System.out.println("Anda Telah Mencapai HyperMart");
            System.out.println("Silahkan Berjualan Sesuka Hati");
        }
    }
}
