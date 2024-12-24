public class DaftarFilm {
        Film[] filmReguler = {
                        new Film("Boneka ambalabu", "Horror",
                                        "Entitas jahat ini dulunya adalah seorang yang dikutuk jadi"
                                                        + "\nsesosok boneka bernama boneka Ambalabu."
                                                        + "\nDia suka membunuh orang yang memiliki koleksi boneka Labubu."
                                                        + "\nMereka muncul pada malam hari pada jam 10 malam, jadi berhati-hatilah.",
                                        2024, 15),
                        new Film("Your Name", "Drama",
                                        "Pada suatu hari Taki dan Mitsuha secara misterius bertukar kehidupan satu sama lain.",
                                        2017, 15),
                        new Film("Suzume", "Fantasi, Petualangan",
                                        "Suzume, seorang gadis muda yang tinggal di sebuah kota kecil di Jepang, memulai"
                                                        + "\npetualangannya setelah bertemu dengan seorang pria misterius bernama Sota. ",
                                        2022, 13),
                        new Film("The Wind Rises", "Drama, Sejarah",
                                        "The Wind Rises adalah kisah fiksi yang terinspirasi oleh kehidupan Jiro Horikoshi,"
                                                        + "\nseorang desainer pesawat tempur Jepang yang terkenal. ",
                                        2013, 13),
                        new Film("Onward", "Animasi, Petualangan, Keluarga",
                                        "Onward menceritakan kisah dua bersaudara elf, Ian dan Barley Lightfoot, yang tinggal di dunia modern yang dulunya penuh dengan sihir. ",
                                        2020, 7),
                        new Film("Gladiator 2", "Aksi, Drama",
                                        "Gladiator 2 adalah kelanjutan dari kisah Maximus Decimus Meridius, yang dalam film pertama mengorbankan hidupnya untuk balas dendam dan melawan kejahatan di dalam kekaisaran Romawi.",
                                        2024, 18)
        };

        Film[] filmPlatinum = {
                        new Film("Boneka ambalabu", "Horror",
                                        "Entitas jahat ini dulunya adalah seorang yang dikutuk jadi"
                                                        + "\nsesosok boneka bernama boneka Ambalabu."
                                                        + "\nDia suka membunuh orang yang memiliki koleksi boneka Labubu."
                                                        + "\nMereka muncul pada malam hari pada jam 10 malam, jadi berhati-hatilah.",
                                        2024, 15),
                        new Film("Your Name", "Drama",
                                        "Pada suatu hari Taki dan Mitsuha secara misterius bertukar kehidupan satu sama lain.",
                                        2017, 15),
                        new Film("Suzume", "Fantasi, Petualangan",
                                        "Suzume, seorang gadis muda yang tinggal di sebuah kota kecil di Jepang, memulai"
                                                        + "\npetualangannya setelah bertemu dengan seorang pria misterius bernama Sota. ",
                                        2022, 13),
                        new Film("The Wind Rises", "Drama, Sejarah",
                                        "The Wind Rises adalah kisah fiksi yang terinspirasi oleh kehidupan Jiro Horikoshi,"
                                                        + "\nseorang desainer pesawat tempur Jepang yang terkenal. ",
                                        2013, 13),
                        new Film("Onward", "Animasi, Petualangan, Keluarga",
                                        "Onward menceritakan kisah dua bersaudara elf, Ian dan Barley Lightfoot, yang tinggal di dunia modern yang dulunya penuh dengan sihir. ",
                                        2020, 7),
                        new Film("Gladiator 2", "Aksi, Drama",
                                        "Gladiator 2 adalah kelanjutan dari kisah Maximus Decimus Meridius, yang dalam film pertama mengorbankan hidupnya untuk balas dendam dan melawan kejahatan di dalam kekaisaran Romawi.",
                                        2024, 18),
                        new Film("Godzilla x Kong: The New Empire", "Aksi, Petualangan",
                                        "Godzilla x Kong: The New Empire melanjutkan kisah pertarungan antara dua monster legendaris, Godzilla dan Kong.",
                                        2024, 13),
                        new Film("Deadpool & Wolverine", "Aksi, Petualangan",
                                        "Deadpool 3 (atau Deadpool & Wolverine) menggabungkan dua karakter ikonik dari dunia X-Men, Deadpool dan Wolverine. ",
                                        2024, 18)
        };

        public void tampilkanFilmReguler() {
                for (Film film : filmReguler) {
                        film.tampilkanInfo();
                        System.out.println();
                }
        }

        public void tampilkanFilmPlatinum() {
                for (Film film : filmPlatinum) {
                        film.tampilkanInfo();
                        System.out.println();
                }
        }

        public boolean ValidJudul(String judul, String status) {
                Film[] daftar = status.equals("reguler") ? filmReguler : filmPlatinum;
                for (Film film : daftar) {
                        if (film.judul.equalsIgnoreCase(judul)) {
                                return true;
                        }
                }
                return false;
        }
}