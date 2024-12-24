public class Sopir {
  private String nama;
  private char sim = 'A';
  private String alamat;
  private int gajiHarian;

  Sopir(String nama, String alamat, int gajiHarian) {
      this.nama = nama;
      this.alamat = alamat;
      this.gajiHarian = gajiHarian;
  }

  public String getNama() {
      return nama;
  }

  public char getSim() {
      return sim;
  }

  public String getAlamat() {
      return alamat;
  }

  public int getGajiHarian() {
      return gajiHarian;
  }

  @Override
  public String toString() {
      return String.format("| %-8s | %-13s | %-5c | %-10d |", nama, alamat, sim, gajiHarian);
  }
}