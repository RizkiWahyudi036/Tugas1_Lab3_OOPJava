public class TiketBioskop {
    private String judulFilm;
    private String jenisTiket;
    private int hargaTiket;

    public TiketBioskop() {
        this("", "", 0);
    }

    public TiketBioskop(String judulFilm, String jenisTiket) {
        this(judulFilm, jenisTiket, 0);
    }

    public TiketBioskop(String judulFilm, String jenisTiket, int hargaTiket) {
        this.judulFilm = judulFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
    }

    // method void untuk membeli tiket
    public void beliTiket() {
        System.out.println("Tiket untuk film " + judulFilm + " telah berhasil dibeli");
    }

    // method non void untuk menghitung harga tiket
    public int hitungHargaTiket(int jumlahTiket) {
        int hargaTotal = hargaTiket * jumlahTiket;
        return hargaTotal;
    }

    public void beliTiket(int jumlahTiket) {
        System.out.println("Tiket sebanyak " + jumlahTiket + " untuk film " + judulFilm + " telah berhasil dibeli");
    }

    // getter dan setter
    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}
