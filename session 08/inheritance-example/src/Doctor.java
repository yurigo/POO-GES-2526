public class Doctor extends Admin {
    private String numberCollegiate;

    public Doctor(String username,
                  String name,
                  String lastName,
                  String email,
                  String numberCollegiate) {
        super(username, name, lastName, email, "DOCTOR");
        this.numberCollegiate = numberCollegiate;
    }

}
