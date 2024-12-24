public class Mobil {
  private String noPolisi;
  private int tahun;
  private String warna;
  private int hargaSewa;

  Mobil(String noPolisi, int tahun, String warna, int hargaSewa) {
    this.noPolisi = noPolisi;
    this.tahun = tahun;
    this.warna = warna;
    this.hargaSewa = hargaSewa;
  }

  public String getNoPolisi() {
    return noPolisi;
  }

  public int getTahun() {
    return tahun;
  }

  public String getWarna() {
    return warna;
  }

  public int getHargaSewa() {
    return hargaSewa;
  }

  @Override
  public String toString() {
    return String.format("| %-10s | %-4d | %-6s | %-10d |", noPolisi, tahun, warna, hargaSewa);
  }
}