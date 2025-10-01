public class Doctor {

    private String name;
    private String lastName;
    private String specialty;
    private int collegiateNumber;

    public Doctor(){
        this(null,null,null,0);
    }

    // Constructor
    public Doctor(String name, String lastName, String specialty, int collegiateNumber) {
        this.name = name;
        this.lastName = lastName;
        this.specialty = specialty;
        this.collegiateNumber = collegiateNumber;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}

