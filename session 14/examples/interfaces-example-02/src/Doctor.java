public class Doctor implements Persistible{
    private String name;
    private String specialty;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String toJSON(){
        return "{ \"name\": \"" + this.name + "\", \"specialty\": \"" + this.specialty + "\" }";
    }
}
