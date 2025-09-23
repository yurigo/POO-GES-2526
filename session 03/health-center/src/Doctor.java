public class Doctor {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCollegiateNumber() {
        return collegiateNumber;
    }

    public void setCollegiateNumber(int collegiateNumber) {
        this.collegiateNumber = collegiateNumber;
    }

    private String name;
    private String lastName;
    private String specialty;
    private int collegiateNumber;

    public String getFullName() {
        return this.name + " " + this.lastName;
    }


}
