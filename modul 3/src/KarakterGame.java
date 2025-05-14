class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;//nilai nama
        this.kesehatan = kesehatan;
    }

    public String getNama() { return nama; }//mengembalikan
    public int getKesehatan() { return kesehatan; }

    public void setKesehatan(int kesehatan) { this.kesehatan = kesehatan; }//ubah kesehatan

    public void tampilkanKesehatan() {
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama());
    }
}
