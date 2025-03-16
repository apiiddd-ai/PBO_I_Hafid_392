class RekeningBank {

    String nomorRekening;//nyimpan
    String namaPemilik;
    double saldo;

    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;//ngisi data rekening
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    void setorUang(double jumlah) {//nambah saldo
        saldo += jumlah;
        System.out.println("Berhasil setor Rp" + jumlah);
        System.out.println("Saldo sekarang: Rp" + saldo);
        System.out.println();
    }

    void tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan Rp" + jumlah);
        }
        System.out.println("Saldo sekarang: Rp" + saldo);
        System.out.println();
    }
}

public class codelab2 {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202410370110392", "Hafid", 5000000);
        RekeningBank rekening2 = new RekeningBank("202410370110399", "Mario", 7500000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(1000000);
        rekening1.tarikUang(2000000);

        rekening2.tarikUang(500000);
    }
}
