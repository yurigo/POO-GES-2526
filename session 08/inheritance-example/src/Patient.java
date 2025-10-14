public class Patient extends User {
    private Integer numberSS;

    public Patient(String username, String name, String lastName, String email, int numberSS) {
        super(username, name, lastName, email);
        this.numberSS = numberSS;
    }
}
