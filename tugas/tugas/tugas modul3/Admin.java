public class Admin extends User {
    private String username = "Apid";
    private String password = "Apid392";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Nama Admin: " + getNama());
        System.out.println("NIM Admin: " + getNim());
    }
}
