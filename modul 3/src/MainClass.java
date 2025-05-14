class Main {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Himmel Sang Pahlawan", 900);
        Musuh viper = new Musuh("Maou Satan", 1000);

        System.out.println("Status awal:");
        brimstone.tampilkanKesehatan();
        viper.tampilkanKesehatan();

        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}
