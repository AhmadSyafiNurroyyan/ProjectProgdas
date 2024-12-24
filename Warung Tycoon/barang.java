/* Kelompok 9
 * 1. Kendra Gavin Tri Daninda (245150207111080)
 * 2. Shafa Rizwana Zarin (245150207111071)
 * 3. Ahmad Syafi Nurroyyan (245150201111041)
 * 4. Aqeela Sahla (245150201111039)
*/

public class barang {
    private String namaBarang;
    private int hargaBarang;
    private int jumBarang;
    private int hargaJual;

    public void setBarang(String namaBarang,int hargaBarang,int jumBarang) {
        this.namaBarang=namaBarang;
        this.hargaBarang=hargaBarang;
        this.jumBarang=jumBarang;
    }

    public void setGudang(String namaBarang,int hargaBarang,int hargaJual, int jumBarang) {
        this.namaBarang=namaBarang;
        this.hargaBarang=hargaBarang;
        this.jumBarang=jumBarang;
        this.hargaJual=hargaJual;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang=hargaBarang;
    }

    public void setJumlahBarang(int jumBarang) {
        this.jumBarang=jumBarang;
    }

    public void setnamaBarang(String namaBarang) {
        this.namaBarang=namaBarang;
    }

    public void sethargaJual(int hargaJual) {
        this.hargaJual=hargaJual;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumBarang;
    }

    public int gethargaJual() {
        return hargaJual;
    }

}