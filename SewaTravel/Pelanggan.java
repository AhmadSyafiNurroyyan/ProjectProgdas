public class Pelanggan {
  private String nama;
  private String noKtp;
  private String alamat;

  Pelanggan() {

  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNoKTP(String noKtp) {
    this.noKtp = noKtp;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getNama() {
    return nama;
  }

  public String getNoKtp() {
    return noKtp;
  }

  public String getAlamat() {
    return alamat;
  }

  @Override
  public String toString() {
    return "Nama: " + nama +"\nNomor KTP: " + noKtp + "\nAlamat: " + alamat;
  }
}