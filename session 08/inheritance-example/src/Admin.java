public class Admin extends User {
    private String rol;

    public Admin(String username, String name, String lastName, String email, String rol) {
        super(username, name, lastName, email);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

}
