class Admin {
    String username = "Apid";
    String password = "Apid392";

    public boolean login(String inputUsername, String inputPassword) {//bandingkan inp user dng data asli
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}
