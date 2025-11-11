public class Paciente implements Persistible, Registrable {
    private String name;
    private int age;

    public Paciente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toJSON(){
        return "{ \"name\": \"" + this.name + "\", \"age\": " + this.age + " }";
    }

    @Override
    public String register() {
        return this.name;
    }
}
