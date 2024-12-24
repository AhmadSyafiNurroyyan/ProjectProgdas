public class Film {
  String judul;
  String genre;
  String sinopsis;
  int tahunRilis;
  int kategoriUmur;

  Film(String judul, String genre, String sinopsis, int tahunRilis, int kategoriUmur) {
    this.judul = judul;
    this.genre = genre;
    this.sinopsis = sinopsis;
    this.tahunRilis = tahunRilis;
    this.kategoriUmur = kategoriUmur;
  }

  public void tampilkanInfo() {
    System.out.println("Judul        : " + judul);
    System.out.println("Genre        : " + genre);
    System.out.println("Tahun rilis  : " + tahunRilis);
    System.out.println("Kategori umur: " + kategoriUmur);
    System.out.println("Sinopsis     : " + sinopsis);
  }
}
