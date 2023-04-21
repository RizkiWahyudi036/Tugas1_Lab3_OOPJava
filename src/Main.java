public class Main {
    public static void main(String[] args) {
        TiketBioskop tiket1 = new TiketBioskop();
        tiket1.setJudulFilm("Spider-Man: No Way Home");
        tiket1.setJenisTiket("Reguler");
        tiket1.setHargaTiket(35000);
        tiket1.beliTiket();

        System.out.println("Harga tiket : Rp" + tiket1.getHargaTiket());
        System.out.println("Judul Film  : "+ tiket1.getJudulFilm());
        System.out.println("Jenis Tiket : "+ tiket1.getJenisTiket());
        System.out.println("Total       : "+ tiket1.hitungHargaTiket(7));

        TiketBioskop tiket2 = new TiketBioskop();
        tiket2.setJudulFilm("Ant-Man : Quantumania");
        tiket2.setJenisTiket("IMAX");
        tiket2.setHargaTiket(50000);
        tiket2.beliTiket();

        System.out.println("Harga tiket : Rp" + tiket2.getHargaTiket());
        System.out.println("Judul Film  : "+ tiket2.getJudulFilm());
        System.out.println("Jenis Tiket : "+ tiket2.getJenisTiket());
        System.out.println("Total       : "+ tiket2.hitungHargaTiket(6));
    }
}
