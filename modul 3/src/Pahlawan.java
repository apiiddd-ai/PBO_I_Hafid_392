class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {//manggil construktor
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Sword Strike!");
        target.setKesehatan(target.getKesehatan() - 800);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
